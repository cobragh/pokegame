package battle.director;

import battle.calculator.StageMultiplierManager;
import battle.in.BattleField;

import static battle.director.WeatherCycleDirector.weatherChange;
import static battle.in.enums.TurnStage.PRE_TURN;
import static battle.in.enums.Weather.CLEAR_SKIES;
import static battle.in.enums.Weather.RAIN;

public class PreTurnAbilitiesDirector {
    public static void preTurnAbilitiesEffects(BattleField battleField) {
        if(battleField.getFirstPokemon().getAttributes().getAbility().getTurnStage().equals(PRE_TURN)) {
            switch (battleField.getFirstPokemon().getAttributes().getAbility()) {
                case DRIZZLE:
                    weatherChange(battleField, RAIN);
                    break;
                case CLOUD_NINE:
                    if (!battleField.getWeather().equals(CLEAR_SKIES)) weatherChange(battleField, CLEAR_SKIES);
                    break;
                case INTIMIDATE:
                    StageMultiplierManager.decreaseStage(battleField.getSecondPokemon().getAttributes().getStats().getAttack(), 1);
            }
        }
    }
}
