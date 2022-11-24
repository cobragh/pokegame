package battle;

import battle.in.BattleField;
import battle.in.Team;
import battle.in.Turn;

public class Battle {
    private Team playerTeam;
    private Team enemyTeam;
    private BattleField battleField;
    private Turn turn;

    public Battle() {}

    public Battle(Team playerTeam, Team enemyTeam, BattleField battleField, Turn turn) {
        this.playerTeam = playerTeam;
        this.enemyTeam = enemyTeam;
        this.battleField = battleField;
        this.turn = turn;
    }

    public void startBattle() {

    }
}
