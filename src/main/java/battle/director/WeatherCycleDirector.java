package battle.director;

import battle.in.BattleField;
import battle.in.enums.Weather;
import pokemon.PocketMonster;
import pokemon.components.BaseStat;
import pokemon.components.Move;
import pokemon.components.enums.Abilities;
import pokemon.components.enums.Types;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import static battle.in.enums.Weather.CLEAR_SKIES;
import static java.math.MathContext.DECIMAL32;
import static pokemon.components.enums.Abilities.CHLOROPHYLL;
import static pokemon.components.enums.Abilities.RAIN_DISH;
import static pokemon.components.enums.Abilities.SAND_VEIL;
import static pokemon.components.enums.Abilities.SWIFT_SWIM;
import static pokemon.components.enums.Types.FIRE;
import static pokemon.components.enums.Types.GROUND;
import static pokemon.components.enums.Types.ICE;
import static pokemon.components.enums.Types.ROCK;
import static pokemon.components.enums.Types.STEEL;
import static pokemon.components.enums.Types.WATER;
import static utils.CalculatorConstants.DOUBLE;
import static utils.CalculatorConstants.HALF;
import static utils.CalculatorConstants.HALF_TWICE;
import static utils.CalculatorConstants.ONE_SIXTEENTH;
import static utils.CalculatorConstants.TWO_THIRDS;
import static utils.CalculatorUtils.weatherEveryEndTurnDamage;

public class WeatherCycleDirector {
    private static final int END_DURATION = 0;
    private static final int INITIAL_DURATION = 6;

    public static void preTurnWeatherCycling(BattleField battleField) {
        if (Objects.equals(battleField.getWeather().getDuration(), END_DURATION)) {
            resetBattleFieldWeather(battleField);
        } else {
            switch (battleField.getWeather()) {
                case CLEAR_SKIES:
                    break;
                case HARSH_SUNLIGHT:
                    harshSunlightAllTurnCyclingEffects(battleField);
                    break;
                case HAIL:
                    battleField.getWeather().decreaseDuration();
                    break;
                case RAIN:
                    rainAllTurnCyclingEffects(battleField);
                    break;
                case SANDSTORM:
                    sandstormAllTurnCyclingEffects(battleField);
                    break;
            }
        }
    }

    public static void turnWeatherCycling() {
        //TODO not implemented yet
    }

    public static void posTurnWeatherCycling(BattleField battleField) {
        List<PocketMonster> activePokemons = List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon());
        switch (battleField.getWeather()) {
            case CLEAR_SKIES:
            case HARSH_SUNLIGHT:
                break;
            case HAIL:
                hailPosTurnCyclingEffects(activePokemons);
                break;
            case RAIN:
                rainPosTurnCyclingEffects(activePokemons);
                break;
            case SANDSTORM:
                sandstormPosTurnCyclingEffects(activePokemons);
                break;
        }
    }

    public static void weatherChange(BattleField battleField, Weather weather) {
        battleField.setPreviousWeather(battleField.getWeather());
        battleField.setWeather(weather);
    }

    private static void resetBattleFieldWeather(BattleField battleField) {
        battleField.setPreviousWeather(battleField.getWeather());
        battleField.setWeather(CLEAR_SKIES);
        adjustWeatherStatsToDefault(battleField);
    }

    private static void adjustWeatherStatsToDefault(BattleField battleField) {
        switch (battleField.getPreviousWeather()) {
            case CLEAR_SKIES:
            case HAIL:
                break;
            case HARSH_SUNLIGHT:
                harshSunlightAllTurnCyclingEffectsOff(battleField);
                break;
            case RAIN:
                rainAllTurnCyclingEffectsOff(battleField);
                break;
            case SANDSTORM:
                weatherStatsEffectsOff(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), SAND_VEIL);
                break;
        }
    }

    private static void hailPosTurnCyclingEffects(List<PocketMonster> pocketMonsters) {
        pocketMonsters.forEach(pocketMonster -> {
            if (pocketMonster.getAttributes().getType().stream().filter(type -> type.equals(ICE)).findAny().isEmpty()) {
                pocketMonster.getAttributes().getStats().getHp()
                        .setActualValue(pocketMonster.getAttributes().getStats().getHp().getActualValue() -
                                pocketMonster.getAttributes().getStats().getHp().getActualValue() * ONE_SIXTEENTH);
            }
        });
    }

    private static void rainAllTurnCyclingEffects(BattleField battleField) {
        if (Objects.equals(battleField.getWeather().getDuration(), INITIAL_DURATION)) {
            increaseTypeDamageEffect(battleField, WATER);
            decreaseTypeDamageEffect(battleField, FIRE);
            weatherStatsEffects(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), SWIFT_SWIM);
            battleField.getWeather().decreaseDuration();
        }
    }

    private static void rainPosTurnCyclingEffects(List<PocketMonster> pocketMonsters) {
        pocketMonsters.forEach(pocketMonster -> {
            if (pocketMonster.getAttributes().getAbility().equals(RAIN_DISH))
                pocketMonster.getAttributes().getStats().getHp()
                        .setActualValue(weatherEveryEndTurnDamage(
                                pocketMonster.getAttributes().getStats().getHp().getActualValue(),
                                pocketMonster.getAttributes().getStats().getHp().getBaseValue()
                        ));
        });
    }

    private static void rainAllTurnCyclingEffectsOff(BattleField battleField) {
            resetStrongTypeDamageEffect(battleField, FIRE);
            resetWeakTypeDamageEffect(battleField, WATER);
            weatherStatsEffectsOff(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), SWIFT_SWIM);
    }

    private static void harshSunlightAllTurnCyclingEffects(BattleField battleField) {
        if (Objects.equals(battleField.getWeather().getDuration(), INITIAL_DURATION)) {
            increaseTypeDamageEffect(battleField, FIRE);
            decreaseTypeDamageEffect(battleField, WATER);
            weatherStatsEffects(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), CHLOROPHYLL);
            battleField.getWeather().decreaseDuration();
        }
    }

    private static void harshSunlightAllTurnCyclingEffectsOff(BattleField battleField) {
        resetStrongTypeDamageEffect(battleField, WATER);
        resetWeakTypeDamageEffect(battleField, FIRE);
        weatherStatsEffectsOff(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), CHLOROPHYLL);
    }

    private static void sandstormAllTurnCyclingEffects(BattleField battleField) {
        if (Objects.equals(battleField.getWeather().getDuration(), INITIAL_DURATION)) {
            weatherStatsEffects(List.of(battleField.getFirstPokemon(), battleField.getSecondPokemon()), SAND_VEIL);
            battleField.getWeather().decreaseDuration();
        }
    }

    private static void sandstormPosTurnCyclingEffects(List<PocketMonster> pocketMonsters) {
        pocketMonsters.forEach(pocketMonster -> {
            if (pocketMonster.getAttributes().getType().stream()
                    .filter(type -> type.equals(ROCK) || type.equals(STEEL) || type.equals(GROUND))
                    .findAny()
                    .isEmpty()) {
                pocketMonster.getAttributes().getStats().getHp()
                        .setActualValue(weatherEveryEndTurnDamage(
                                pocketMonster.getAttributes().getStats().getHp().getActualValue(),
                                pocketMonster.getAttributes().getStats().getHp().getBaseValue()
                        ));
            }
        });
    }

    private static void resetStrongTypeDamageEffect(BattleField battleField, Types type) {
        List<Move> firstPokemonMoves = battleField.getFirstPokemon().getMoves().getMoveList();
        List<Move> secondPokemonMoves = battleField.getSecondPokemon().getMoves().getMoveList();

        resetEachMoveDamageStrongByType(firstPokemonMoves, type);
        resetEachMoveDamageStrongByType(secondPokemonMoves, type);
    }

    private static void resetWeakTypeDamageEffect(BattleField battleField, Types type) {
        List<Move> firstPokemonMoves = battleField.getFirstPokemon().getMoves().getMoveList();
        List<Move> secondPokemonMoves = battleField.getSecondPokemon().getMoves().getMoveList();

        resetEachMoveDamageByWeakType(firstPokemonMoves, type);
        resetEachMoveDamageByWeakType(secondPokemonMoves, type);
    }

    private static void decreaseTypeDamageEffect(BattleField battleField, Types type) {
        List<Move> firstPokemonMoves = battleField.getFirstPokemon().getMoves().getMoveList();
        List<Move> secondPokemonMoves = battleField.getSecondPokemon().getMoves().getMoveList();

        decreaseEachMoveDamageByType(firstPokemonMoves, type);
        decreaseEachMoveDamageByType(secondPokemonMoves, type);
    }

    private static void resetEachMoveDamageByWeakType(List<Move> moves, Types type) {
        moves.forEach(move -> {
            if (move.getType().equals(type)) {
                move.setPower(move.getPower().multiply(BigDecimal.valueOf(TWO_THIRDS), DECIMAL32));
            }
        });
    }

    private static void resetEachMoveDamageStrongByType(List<Move> moves, Types type) {
        moves.forEach(move -> {
            if (move.getType().equals(type)) {
                move.setPower(move.getPower().multiply(BigDecimal.valueOf(DOUBLE), DECIMAL32));
            }
        });
    }

    private static void decreaseEachMoveDamageByType(List<Move> moves, Types type) {
        moves.forEach(move -> {
            if (move.getType().equals(type)) {
                move.setPower(move.getPower().multiply(BigDecimal.valueOf(HALF), DECIMAL32));
            }
        });
    }

    private static void increaseTypeDamageEffect(BattleField battleField, Types type) {
        List<Move> firstPokemonMoves = battleField.getFirstPokemon().getMoves().getMoveList();
        List<Move> secondPokemonMoves = battleField.getSecondPokemon().getMoves().getMoveList();

        increaseEachMoveDamageByType(firstPokemonMoves, type);
        increaseEachMoveDamageByType(secondPokemonMoves, type);
    }

    private static void increaseEachMoveDamageByType(List<Move> moves, Types type) {
        moves.forEach(move -> {
            if (move.getType().equals(type)) {
                move.setPower(move.getPower().multiply(BigDecimal.valueOf(HALF_TWICE), DECIMAL32));
            }
        });
    }

    private static void weatherStatsEffects(List<PocketMonster> pocketMonsters, Abilities ability) {
        pocketMonsters.forEach(pocketMonster -> {
            if (pocketMonster.getAttributes().getAbility().equals(ability))
                doubleStat(pocketMonster.getAttributes().getStats().getSpeed());
        });
    }

    private static void weatherStatsEffectsOff(List<PocketMonster> pocketMonsters, Abilities ability) {
        pocketMonsters.forEach(pocketMonster -> {
            if (pocketMonster.getAttributes().getAbility().equals(ability))
                divideStat(pocketMonster.getAttributes().getStats().getSpeed());
        });
    }

    private static void doubleStat(BaseStat stat) {
        stat.setActualValue(stat.getActualValue() * DOUBLE);
    }

    private static void divideStat(BaseStat stat) {
        stat.setActualValue(stat.getActualValue() * HALF);
    }
}
