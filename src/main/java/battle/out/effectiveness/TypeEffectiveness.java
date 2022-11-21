package battle.out.effectiveness;

import pokemon.Effectiveness;
import pokemon.Attributes;
import pokemon.enums.Types;

import java.util.*;

import static pokemon.enums.Types.BUG;
import static pokemon.enums.Types.DARK;
import static pokemon.enums.Types.DRAGON;
import static pokemon.enums.Types.ELECTRIC;
import static pokemon.enums.Types.FAIRY;
import static pokemon.enums.Types.FIGHTING;
import static pokemon.enums.Types.FIRE;
import static pokemon.enums.Types.FLYING;
import static pokemon.enums.Types.GHOST;
import static pokemon.enums.Types.GRASS;
import static pokemon.enums.Types.GROUND;
import static pokemon.enums.Types.ICE;
import static pokemon.enums.Types.NORMAL;
import static pokemon.enums.Types.POISON;
import static pokemon.enums.Types.PSYCHIC;
import static pokemon.enums.Types.ROCK;
import static pokemon.enums.Types.STEEL;
import static pokemon.enums.Types.WATER;

public class TypeEffectiveness {
    private static final int MONOTYPE = 1;

    public static void setEffectiveness(Attributes attributes) {
        if (Objects.equals(attributes.getType().size(), MONOTYPE)) {
            attributes.setEffectiveness(getMonoTypeEffectiveness(attributes));
        } else {
            setDualTypeWeaknesses(attributes);
        }
    }

    public static void setDualTypeWeaknesses(Attributes attributes) {
        attributes.setEffectiveness(getMonoTypeEffectiveness(attributes));
        for (int i = 0; i<attributes.getEffectiveness().size(); i++) {
            for (int j = i+1; j<attributes.getEffectiveness().size(); j++) {
                if (Objects.equals(attributes.getEffectiveness().get(i).getType(), attributes.getEffectiveness().get(j).getType())) {
                    attributes.getEffectiveness().get(i)
                            .setEffectiveness(attributes.getEffectiveness().get(i).getEffectiveness() * attributes.getEffectiveness().get(j).getEffectiveness());
                    attributes.getEffectiveness().remove(j);
                }
            }
        }
    }

    public static List<Effectiveness> getMonoTypeEffectiveness(Attributes attributes) {
        List<Effectiveness> effectiveness = new ArrayList<>();
        attributes.getType().forEach(types -> {
            switch (types) {
                case FIRE:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, WATER, GROUND, ROCK),
                            setEffectivenessType(0.5, BUG, STEEL, FIRE, GRASS, ICE, FAIRY),
                            setEffectivenessType(1.0, DARK, DRAGON, ELECTRIC, FIGHTING, FLYING, GHOST, NORMAL, PSYCHIC, POISON)
                    ));
                    break;
                case WATER:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, ELECTRIC, GRASS),
                            setEffectivenessType(0.5, STEEL, FIRE, WATER, ICE),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, FAIRY, FIGHTING, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, POISON, ROCK)
                    ));
                    break;
                case STEEL:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FIGHTING, GROUND, FIRE),
                            setEffectivenessType(0.5, NORMAL, FLYING, ROCK, BUG, STEEL, GRASS, PSYCHIC, ICE, DRAGON, FAIRY),
                            setEffectivenessType(0.0, POISON),
                            setEffectivenessType(1.0, DARK, ELECTRIC, GHOST, WATER)
                    ));
                    break;
                case ROCK:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FIGHTING, GROUND, STEEL, WATER, GRASS),
                            setEffectivenessType(0.5, NORMAL, FLYING, POISON, FIRE),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, ELECTRIC, FAIRY, GHOST, ICE, PSYCHIC, ROCK)
                    ));
                    break;
                case PSYCHIC:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, BUG, GHOST, DARK),
                            setEffectivenessType(0.5, FIGHTING, PSYCHIC),
                            setEffectivenessType(1.0, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case POISON:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, GROUND, PSYCHIC),
                            setEffectivenessType(0.5, FIGHTING, POISON, GRASS, FAIRY),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, ELECTRIC, FIRE, FLYING, GHOST, ICE, NORMAL, ROCK, STEEL, WATER)
                    ));
                    break;
                case NORMAL:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FIGHTING),
                            setEffectivenessType(0.0, GHOST),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, PSYCHIC, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case ICE:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FIGHTING, ROCK, STEEL, FIRE),
                            setEffectivenessType(0.5, ICE),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, ELECTRIC, FAIRY, FLYING, GHOST, GRASS, GROUND, NORMAL, PSYCHIC, POISON, WATER)
                    ));
                    break;
                case GROUND:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, WATER, GRASS, ICE),
                            setEffectivenessType(0.5, POISON, ROCK),
                            setEffectivenessType(0.0, ELECTRIC),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, FAIRY, FIGHTING, FIRE, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, STEEL)
                    ));
                    break;
                case GRASS:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FLYING, POISON, BUG, FIRE, ICE),
                            setEffectivenessType(0.5, GROUND, WATER, GRASS, ELECTRIC),
                            setEffectivenessType(1.0, DARK, DRAGON, FAIRY, FIGHTING, GHOST, NORMAL, PSYCHIC, ROCK, STEEL)
                    ));
                    break;
                case GHOST:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, GHOST, DARK),
                            setEffectivenessType(0.5, POISON, BUG),
                            setEffectivenessType(0.0, NORMAL, FIGHTING),
                            setEffectivenessType(1.0, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, PSYCHIC, ROCK, STEEL, WATER)
                    ));
                    break;
                case FLYING:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, ROCK, ELECTRIC, ICE),
                            setEffectivenessType(0.5, FIGHTING, BUG, GRASS),
                            setEffectivenessType(0.0, GROUND),
                            setEffectivenessType(1.0, DARK, DRAGON, FAIRY, FIRE, FLYING, GHOST, NORMAL, PSYCHIC, POISON, STEEL, WATER)
                    ));
                    break;
                case FIGHTING:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FLYING, PSYCHIC, FAIRY),
                            setEffectivenessType(0.5, ROCK, BUG, DARK),
                            setEffectivenessType(1.0, DRAGON, ELECTRIC, FIGHTING, FIRE, GHOST, GRASS, GROUND, ICE, NORMAL, POISON, STEEL, WATER)
                    ));
                    break;
                case FAIRY:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, POISON, STEEL),
                            setEffectivenessType(0.5, FIGHTING, BUG, DARK),
                            setEffectivenessType(0.0, DRAGON),
                            setEffectivenessType(1.0, ELECTRIC, FAIRY, FIRE, FLYING, GHOST, GRASS, GROUND, ICE, NORMAL, PSYCHIC, ROCK, WATER)
                    ));
                    break;
                case ELECTRIC:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, GROUND),
                            setEffectivenessType(0.5, FLYING, STEEL, ELECTRIC),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, FAIRY, FIGHTING, FIRE, GHOST, GRASS, ICE, NORMAL, PSYCHIC, POISON, ROCK, WATER)
                    ));
                    break;
                case DRAGON:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, ICE, DRAGON, FAIRY),
                            setEffectivenessType(0.5, FIRE, WATER, GRASS, ELECTRIC),
                            setEffectivenessType(1.0, BUG, DARK, FIGHTING, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, POISON, ROCK, STEEL)
                    ));
                    break;
                case DARK:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FIGHTING, BUG, FAIRY),
                            setEffectivenessType(0.5, GHOST, DARK),
                            setEffectivenessType(0.0, PSYCHIC),
                            setEffectivenessType(1.0, DRAGON, ELECTRIC, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case BUG:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(2.0, FLYING, ROCK, FIRE),
                            setEffectivenessType(0.5, FIGHTING, GROUND, GRASS),
                            setEffectivenessType(1.0, BUG, DARK, DRAGON, ELECTRIC, FAIRY, GHOST, ICE, NORMAL, PSYCHIC, POISON, STEEL, WATER)
                    ));
                    break;
            }
        });

        return effectiveness;
    }

    private static List<Effectiveness> setEffectivenessType(double effectiveness, Types... types) {
        List<Effectiveness> effectivenessList = new ArrayList<>();
        Arrays.stream(types).forEach(type -> effectivenessList.add(new Effectiveness(type, effectiveness)));

        return effectivenessList;
    }

    private static List<Effectiveness> arrangeEffectiveness(List<Effectiveness>... effectiveness) {
        List<Effectiveness> effectivenessList = new ArrayList<>();
        Arrays.stream(effectiveness).forEach(effectivenessLevel -> effectivenessLevel.forEach(
                effectivenessInstance -> effectivenessList.add(effectivenessInstance)
        ));

        Collections.sort(effectivenessList, Collections.reverseOrder());
        return effectivenessList;
    }
}
