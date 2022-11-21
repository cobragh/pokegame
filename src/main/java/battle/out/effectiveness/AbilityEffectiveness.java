package battle.out.effectiveness;

import pokemon.Attributes;

public class AbilityEffectiveness {
    public static void analysisAbilityEffectiveness(Attributes attributes) {
        switch(attributes.getAbility()) {
            case FLASH_FIRE:
                attributes.getEffectiveness().get(6).setEffectiveness(0.0);
                break;
            case WATER_ABSORB:
                attributes.getEffectiveness().get(17).setEffectiveness(0.0);
                break;
            case VOLT_ABSORB:
            case LIGHTNING_ROD:
                attributes.getEffectiveness().get(3).setEffectiveness(0.0);
                break;
            case LEVITATE:
                attributes.getEffectiveness().get(10).setEffectiveness(0.0);
                break;
            case THICK_FAT:
                attributes.getEffectiveness().get(6).setEffectiveness(attributes.getEffectiveness().get(6).getEffectiveness()/2);
                attributes.getEffectiveness().get(6).setEffectiveness(attributes.getEffectiveness().get(11).getEffectiveness()/2);
                break;
        }
    }
}
