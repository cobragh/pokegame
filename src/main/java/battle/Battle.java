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

    public Team getPlayerTeam() {
        return playerTeam;
    }

    public void setPlayerTeam(Team playerTeam) {
        this.playerTeam = playerTeam;
    }

    public Team getEnemyTeam() {
        return enemyTeam;
    }

    public void setEnemyTeam(Team enemyTeam) {
        this.enemyTeam = enemyTeam;
    }

    public BattleField getBattleField() {
        return battleField;
    }

    public void setBattleField(BattleField battleField) {
        this.battleField = battleField;
    }

    public Turn getTurn() {
        return turn;
    }

    public void setTurn(Turn turn) {
        this.turn = turn;
    }
}
