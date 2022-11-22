package pokemon.calculator;

import pokemon.components.Effectiveness;
import pokemon.components.Attributes;
import pokemon.components.enums.Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static pokemon.components.enums.Types.BUG;
import static pokemon.components.enums.Types.DARK;
import static pokemon.components.enums.Types.DRAGON;
import static pokemon.components.enums.Types.ELECTRIC;
import static pokemon.components.enums.Types.FAIRY;
import static pokemon.components.enums.Types.FIGHTING;
import static pokemon.components.enums.Types.FIRE;
import static pokemon.components.enums.Types.FLYING;
import static pokemon.components.enums.Types.GHOST;
import static pokemon.components.enums.Types.GRASS;
import static pokemon.components.enums.Types.GROUND;
import static pokemon.components.enums.Types.ICE;
import static pokemon.components.enums.Types.NORMAL;
import static pokemon.components.enums.Types.POISON;
import static pokemon.components.enums.Types.PSYCHIC;
import static pokemon.components.enums.Types.ROCK;
import static pokemon.components.enums.Types.STEEL;
import static pokemon.components.enums.Types.WATER;
import static utils.CalculatorConstants.DEFAULT;
import static utils.CalculatorConstants.DOUBLE;
import static utils.CalculatorConstants.HALF;
import static utils.CalculatorConstants.ZERO;

public class TypeEffectivenessManager {
    private static final int MONOTYPE = 1;

    public static void typeEffectivenessCalculator(Attributes attributes) {
        if (Objects.equals(attributes.getType().size(), MONOTYPE)) {
            attributes.setEffectiveness(getMonoTypeEffectiveness(attributes));
        } else {
            setDualTypeEffectiveness(attributes);
        }
    }

    private static void setDualTypeEffectiveness(Attributes attributes) {
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

    private static List<Effectiveness> getMonoTypeEffectiveness(Attributes attributes) {
        List<Effectiveness> effectiveness = new ArrayList<>();
        attributes.getType().forEach(types -> {
            
            switch (types) {
                case FIRE:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, WATER, GROUND, ROCK),
                            setEffectivenessType(HALF, BUG, STEEL, FIRE, GRASS, ICE, FAIRY),
                            setEffectivenessType(DEFAULT, DARK, DRAGON, ELECTRIC, FIGHTING, FLYING, GHOST, NORMAL, PSYCHIC, POISON)
                    ));
                    break;
                case WATER:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, ELECTRIC, GRASS),
                            setEffectivenessType(HALF, STEEL, FIRE, WATER, ICE),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, FAIRY, FIGHTING, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, POISON, ROCK)
                    ));
                    break;
                case STEEL:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FIGHTING, GROUND, FIRE),
                            setEffectivenessType(HALF, NORMAL, FLYING, ROCK, BUG, STEEL, GRASS, PSYCHIC, ICE, DRAGON, FAIRY),
                            setEffectivenessType(ZERO, POISON),
                            setEffectivenessType(DEFAULT, DARK, ELECTRIC, GHOST, WATER)
                    ));
                    break;
                case ROCK:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FIGHTING, GROUND, STEEL, WATER, GRASS),
                            setEffectivenessType(HALF, NORMAL, FLYING, POISON, FIRE),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, ELECTRIC, FAIRY, GHOST, ICE, PSYCHIC, ROCK)
                    ));
                    break;
                case PSYCHIC:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, BUG, GHOST, DARK),
                            setEffectivenessType(HALF, FIGHTING, PSYCHIC),
                            setEffectivenessType(DEFAULT, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case POISON:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, GROUND, PSYCHIC),
                            setEffectivenessType(HALF, FIGHTING, POISON, GRASS, FAIRY),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, ELECTRIC, FIRE, FLYING, GHOST, ICE, NORMAL, ROCK, STEEL, WATER)
                    ));
                    break;
                case NORMAL:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FIGHTING),
                            setEffectivenessType(ZERO, GHOST),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, PSYCHIC, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case ICE:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FIGHTING, ROCK, STEEL, FIRE),
                            setEffectivenessType(HALF, ICE),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, ELECTRIC, FAIRY, FLYING, GHOST, GRASS, GROUND, NORMAL, PSYCHIC, POISON, WATER)
                    ));
                    break;
                case GROUND:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, WATER, GRASS, ICE),
                            setEffectivenessType(HALF, POISON, ROCK),
                            setEffectivenessType(ZERO, ELECTRIC),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, FAIRY, FIGHTING, FIRE, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, STEEL)
                    ));
                    break;
                case GRASS:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FLYING, POISON, BUG, FIRE, ICE),
                            setEffectivenessType(HALF, GROUND, WATER, GRASS, ELECTRIC),
                            setEffectivenessType(DEFAULT, DARK, DRAGON, FAIRY, FIGHTING, GHOST, NORMAL, PSYCHIC, ROCK, STEEL)
                    ));
                    break;
                case GHOST:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, GHOST, DARK),
                            setEffectivenessType(HALF, POISON, BUG),
                            setEffectivenessType(ZERO, NORMAL, FIGHTING),
                            setEffectivenessType(DEFAULT, DRAGON, ELECTRIC, FAIRY, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, PSYCHIC, ROCK, STEEL, WATER)
                    ));
                    break;
                case FLYING:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, ROCK, ELECTRIC, ICE),
                            setEffectivenessType(HALF, FIGHTING, BUG, GRASS),
                            setEffectivenessType(ZERO, GROUND),
                            setEffectivenessType(DEFAULT, DARK, DRAGON, FAIRY, FIRE, FLYING, GHOST, NORMAL, PSYCHIC, POISON, STEEL, WATER)
                    ));
                    break;
                case FIGHTING:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FLYING, PSYCHIC, FAIRY),
                            setEffectivenessType(HALF, ROCK, BUG, DARK),
                            setEffectivenessType(DEFAULT, DRAGON, ELECTRIC, FIGHTING, FIRE, GHOST, GRASS, GROUND, ICE, NORMAL, POISON, STEEL, WATER)
                    ));
                    break;
                case FAIRY:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, POISON, STEEL),
                            setEffectivenessType(HALF, FIGHTING, BUG, DARK),
                            setEffectivenessType(ZERO, DRAGON),
                            setEffectivenessType(DEFAULT, ELECTRIC, FAIRY, FIRE, FLYING, GHOST, GRASS, GROUND, ICE, NORMAL, PSYCHIC, ROCK, WATER)
                    ));
                    break;
                case ELECTRIC:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, GROUND),
                            setEffectivenessType(HALF, FLYING, STEEL, ELECTRIC),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, FAIRY, FIGHTING, FIRE, GHOST, GRASS, ICE, NORMAL, PSYCHIC, POISON, ROCK, WATER)
                    ));
                    break;
                case DRAGON:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, ICE, DRAGON, FAIRY),
                            setEffectivenessType(HALF, FIRE, WATER, GRASS, ELECTRIC),
                            setEffectivenessType(DEFAULT, BUG, DARK, FIGHTING, FLYING, GHOST, GROUND, NORMAL, PSYCHIC, POISON, ROCK, STEEL)
                    ));
                    break;
                case DARK:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FIGHTING, BUG, FAIRY),
                            setEffectivenessType(HALF, GHOST, DARK),
                            setEffectivenessType(ZERO, PSYCHIC),
                            setEffectivenessType(DEFAULT, DRAGON, ELECTRIC, FIRE, FLYING, GRASS, GROUND, ICE, NORMAL, POISON, ROCK, STEEL, WATER)
                    ));
                    break;
                case BUG:
                    effectiveness.addAll(arrangeEffectiveness(
                            setEffectivenessType(DOUBLE, FLYING, ROCK, FIRE),
                            setEffectivenessType(HALF, FIGHTING, GROUND, GRASS),
                            setEffectivenessType(DEFAULT, BUG, DARK, DRAGON, ELECTRIC, FAIRY, GHOST, ICE, NORMAL, PSYCHIC, POISON, STEEL, WATER)
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
        Arrays.stream(effectiveness).forEach(effectivenessList::addAll);

        effectivenessList.sort(Collections.reverseOrder());
        return effectivenessList;
    }
}
