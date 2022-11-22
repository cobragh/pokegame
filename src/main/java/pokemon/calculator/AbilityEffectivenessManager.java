package pokemon.calculator;

import pokemon.components.Attributes;
import pokemon.components.enums.Types;

import static utils.CalculatorConstants.HALF;
import static utils.CalculatorConstants.ZERO;

public class AbilityEffectivenessManager {
    private static final int FIRE = Types.FIRE.ordinal();
    private static final int WATER = Types.WATER.ordinal();
    private static final int ICE = Types.ICE.ordinal();
    private static final int ELECTRIC = Types.ELECTRIC.ordinal();
    private static final int GROUND = Types.GROUND.ordinal();

    public static void analyzeAbilityEffectiveness(Attributes attributes) {
        switch(attributes.getAbility()) {
            case FLASH_FIRE:
                attributes.getEffectiveness().get(FIRE).setEffectiveness(ZERO);
                break;
            case WATER_ABSORB:
                attributes.getEffectiveness().get(WATER).setEffectiveness(ZERO);
                break;
            case VOLT_ABSORB:
            case LIGHTNING_ROD:
                attributes.getEffectiveness().get(ELECTRIC).setEffectiveness(ZERO);
                break;
            case LEVITATE:
                attributes.getEffectiveness().get(GROUND).setEffectiveness(ZERO);
                break;
            case THICK_FAT:
                attributes.getEffectiveness().get(FIRE).setEffectiveness(attributes.getEffectiveness().get(FIRE).getEffectiveness() * HALF);
                attributes.getEffectiveness().get(ICE).setEffectiveness(attributes.getEffectiveness().get(ICE).getEffectiveness() * HALF);
                break;
        }
    }
}
