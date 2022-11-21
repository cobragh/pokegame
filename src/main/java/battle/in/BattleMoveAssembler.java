package battle.in;

import pokemon.components.AdditionalEffect;
import pokemon.components.Move;
import pokemon.components.enums.MoveCategory;
import pokemon.components.enums.Status;
import pokemon.components.enums.Types;

public class BattleMoveAssembler {

    public static Move normalPhysicalMove(String name, int pp, double power, double accuracy) {
        return new Move(name, Types.NORMAL, pp, power, accuracy, MoveCategory.PHYSICAL, new AdditionalEffect(false, Status.NONE, 0.0));
    }

    public static Move fireSpecialMoveAE(String name, int pp, double power, double accuracy, Status status, double chance) {
        return new Move(name, Types.FIRE, pp, power, accuracy, MoveCategory.SPECIAL, new AdditionalEffect(true, status, chance));
    }

    public static Move waterSpecialAE(String name, int pp, double power, double accuracy, Status status, double chance) {
        return new Move(name, Types.WATER, pp, power, accuracy, MoveCategory.SPECIAL, new AdditionalEffect(true, status, chance));
    }
}
