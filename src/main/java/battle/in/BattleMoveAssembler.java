package battle.in;

import pokemon.AdditionalEffect;
import pokemon.Move;
import pokemon.enums.MoveCategory;
import pokemon.enums.Status;
import pokemon.enums.Types;

public class BattleMoveAssembler {

    public static Move normalPhysicalMove(String name, int pp, double power, double accuracy) {
        return new Move(name, Types.NORMAL, MoveCategory.PHYSICAL, new AdditionalEffect(false, Status.NONE, 0.0), pp, power, accuracy);
    }

    public static Move fireSpecialMoveAE(String name, int pp, double power, double accuracy, Status status, double chance) {
        return new Move(name, Types.FIRE, MoveCategory.SPECIAL, new AdditionalEffect(true, status, chance), pp, power, accuracy);
    }

    public static Move waterSpecialAE(String name, int pp, double power, double accuracy, Status status, double chance) {
        return new Move(name, Types.WATER, MoveCategory.SPECIAL, new AdditionalEffect(true, status, chance), pp, power, accuracy);
    }
}
