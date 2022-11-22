package battle.director;

import battle.Battle;

import static battle.director.WeatherCycleDirector.posTurnWeatherCycling;
import static battle.director.WeatherCycleDirector.preTurnWeatherCycling;
import static battle.director.WeatherCycleDirector.turnWeatherCycling;

public class TurnCycleDirector {
    public static void startTurnCycle(Battle battle) {

    }

    private static void startPreTurn(Battle battle) {
        preTurnWeatherCycling(battle.getBattleField());
    }

    private static void startTurn() {
        turnWeatherCycling();
    }

    private static void startPosTurn(Battle battle) {
        posTurnWeatherCycling(battle.getBattleField());
    }
}
