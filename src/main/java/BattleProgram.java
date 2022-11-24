import battle.Battle;
import battle.director.WeatherCycleDirector;
import battle.in.BattleField;
import battle.in.Team;
import battle.in.Turn;
import battle.in.enums.Terrain;
import battle.in.enums.TurnStage;
import battle.in.enums.Weather;
import pokemon.Moves;
import pokemon.PocketMonster;
import pokemon.calculator.AttributeManager;
import pokemon.calculator.TypeEffectivenessManager;
import pokemon.components.Attributes;
import pokemon.components.BaseStat;
import pokemon.components.Level;
import pokemon.components.Specie;
import pokemon.components.Stats;
import pokemon.components.enums.Abilities;
import pokemon.components.enums.Genders;
import pokemon.components.enums.Items;
import pokemon.components.enums.MoveList;
import pokemon.components.enums.Natures;
import pokemon.components.enums.SpecieCategory;
import pokemon.components.enums.Types;

import java.util.List;

public class BattleProgram {
    public static void main(String[] args) {
        Stats<Integer> charizardStats = new Stats<>(78, 84, 109, 78, 85, 100);
        Specie charizardSpecie = new Specie(006, "Charizard", 1.7, 90.5, SpecieCategory.DRAGON, "It is said that Charizard's fire burns hotter if it has experienced harsh battles.", charizardStats);
        Moves charizardMoves = new Moves(MoveList.CUT.getMove(), MoveList.EMBER.getMove(), MoveList.POUND.getMove(), MoveList.TACKLE.getMove());
        Stats<BaseStat> charizardStat = new Stats<>(new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31));
        Level charizardLevel = new Level(50, 0, 0, 0);
        Attributes charizardAttributes = new Attributes(Abilities.BLAZE, charizardLevel, List.of(Types.FIRE, Types.FLYING), null, charizardStat, Natures.JOLLY);
        PocketMonster charizard = new PocketMonster(1L, "Charizard", Genders.MALE, true, 255d, charizardSpecie, Items.ASPEAR_BERRY, charizardMoves, charizardAttributes);
        TypeEffectivenessManager.typeEffectivenessCalculator(charizard.getAttributes());
        AttributeManager.attributeCalculator(charizard.getSpecie().getBaseStats(), charizard.getAttributes());
        Team playerTeam = new Team();
        playerTeam.setFirstPokemon(charizard);

        Stats<Integer> venusaurStats = new Stats<>(80, 82, 100, 83, 100, 80);
        Specie venusaurSpecie = new Specie(003, "Venusaur", 2d, 100d, SpecieCategory.SEED, "Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.", venusaurStats);
        Moves venusaurMoves = new Moves(MoveList.CUT.getMove(), MoveList.EMBER.getMove(), MoveList.POUND.getMove(), MoveList.BUBBLE_BEAM.getMove());
        Stats<BaseStat> venusaurStat = new Stats<>(new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31));
        Level venusaurLevel = new Level(50, 0, 0, 0);
        Attributes venusaurAttributes = new Attributes(Abilities.CHLOROPHYLL, venusaurLevel, List.of(Types.GRASS, Types.POISON), null, venusaurStat, Natures.ADAMANT);
        PocketMonster venusaur = new PocketMonster(2L, "Venusaur", Genders.FEMALE, false, 255d, venusaurSpecie, Items.ASPEAR_BERRY, venusaurMoves, venusaurAttributes);
        TypeEffectivenessManager.typeEffectivenessCalculator(venusaur.getAttributes());
        AttributeManager.attributeCalculator(venusaur.getSpecie().getBaseStats(), venusaur.getAttributes());
        Team enemyTeam = new Team();
        enemyTeam.setFirstPokemon(venusaur);

        BattleField battleField = new BattleField(Weather.RAIN, Weather.CLEAR_SKIES, Terrain.DEFAULT, playerTeam.getFirstPokemon(), enemyTeam.getFirstPokemon());
        Turn turn = new Turn(1, TurnStage.PRE_TURN);
        Battle battle = new Battle(playerTeam, enemyTeam, battleField, turn);
        WeatherCycleDirector.preTurnWeatherCycling(battleField);
        battleField.getWeather().decreaseDuration();
        battleField.getWeather().decreaseDuration();
        battleField.getWeather().decreaseDuration();
        battleField.getWeather().decreaseDuration();
        battleField.getWeather().decreaseDuration();
        WeatherCycleDirector.preTurnWeatherCycling(battleField);
        System.out.println(charizard);
        System.out.println(venusaur);
    }
}
