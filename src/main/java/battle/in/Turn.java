package battle.in;

import battle.in.enums.TurnStage;

public class Turn {
    private int turnNumber;
    private TurnStage turnStage;

    public Turn() {}

    public Turn(int turnNumber, TurnStage turnStage) {
        this.turnNumber = turnNumber;
        this.turnStage = turnStage;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public TurnStage getTurnStage() {
        return turnStage;
    }

    public void setTurnStage(TurnStage turnStage) {
        this.turnStage = turnStage;
    }
}
