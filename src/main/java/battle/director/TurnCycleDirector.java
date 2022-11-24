package battle.director;

import battle.Battle;
import battle.in.BattleField;

import static battle.director.WeatherCycleDirector.posTurnWeatherCycling;
import static battle.director.WeatherCycleDirector.preTurnWeatherCycling;
import static battle.director.WeatherCycleDirector.turnWeatherCycling;

public class TurnCycleDirector {
    public static void startTurnCycle(Battle battle) {

    }

    private static void startPreTurn(BattleField battleField) {
        preTurnWeatherCycling(battleField);
    }

    private static void startTurn() {
        turnWeatherCycling();
    }

    private static void startPosTurn(BattleField battleField) {
        posTurnWeatherCycling(battleField);
    }
}
