package pokemon;

import pokemon.components.Move;

import java.util.List;

public class Moves {
    private Move firstMove;
    private Move secondMove;
    private Move thirdMove;
    private Move fourthMove;

    public Moves() {}

    public Moves(Move firstMove, Move secondMove, Move thirdMove, Move fourthMove) {
        this.firstMove = firstMove;
        this.secondMove = secondMove;
        this.thirdMove = thirdMove;
        this.fourthMove = fourthMove;
    }

    public Move getFirstMove() {
        return firstMove;
    }

    public void setFirstMove(Move firstMove) {
        this.firstMove = firstMove;
    }

    public Move getSecondMove() {
        return secondMove;
    }

    public void setSecondMove(Move secondMove) {
        this.secondMove = secondMove;
    }

    public Move getThirdMove() {
        return thirdMove;
    }

    public void setThirdMove(Move thirdMove) {
        this.thirdMove = thirdMove;
    }

    public Move getFourthMove() {
        return fourthMove;
    }

    public void setFourthMove(Move fourthMove) {
        this.fourthMove = fourthMove;
    }

    public List<Move> getMoveList() {
        return List.of(firstMove, secondMove, thirdMove, fourthMove);
    }
}
