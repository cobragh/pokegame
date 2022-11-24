package pokemon.components.enums;

import pokemon.components.Move;

import java.math.BigDecimal;

import static battle.in.BattleMoveAssembler.fireSpecialMoveAE;
import static battle.in.BattleMoveAssembler.normalPhysicalMove;
import static battle.in.BattleMoveAssembler.waterSpecialAE;

public enum MoveList {
    POUND(normalPhysicalMove("Pound", 35, BigDecimal.valueOf(40), 100d)),
    TACKLE(normalPhysicalMove("Tackle", 35, BigDecimal.valueOf(40), 100d)),
    EMBER(fireSpecialMoveAE("Ember", 25, BigDecimal.valueOf(40), 100d, Status.BURNED, 30d)),
    CUT(normalPhysicalMove("Cut", 30, BigDecimal.valueOf(50), 95d)),
    BUBBLE_BEAM(waterSpecialAE("Bubble Beam", 20, BigDecimal.valueOf(65), 100d, Status.SPEED, 33.2));
    private final Move move;
    MoveList(Move move) {
        this.move = move;
    }

    public Move getMove() {
        return new Move(move.getName(), move.getType(), move.getPp(), move.getPower(), move.getAccuracy(), move.getCategory(), move.getAdditionalEffect());
    }
}
