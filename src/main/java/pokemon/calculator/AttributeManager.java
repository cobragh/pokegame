package pokemon.calculator;

import pokemon.components.Attributes;
import pokemon.components.BaseStat;
import pokemon.components.Stats;
import pokemon.components.enums.Natures;

public class AttributeManager {
    private static final double INCREASE_MULTIPLIER = 1.1;
    private static final double DECREASE_MULTIPLIER = 0.9;

    public static void attributeCalculator(Stats<Integer> specieStats, Attributes attributes) {
        int level = attributes.getLevel().getLevel();

        attributes.getStats().getHp().setBaseValue(lifeStatCalculator(specieStats, attributes.getStats().getHp(), level));
        attributes.getStats().getAttack().setBaseValue(statCalculator(specieStats.getAttack(), attributes.getStats().getAttack(), level));
        attributes.getStats().getDefense().setBaseValue(statCalculator(specieStats.getDefense(), attributes.getStats().getDefense(), level));
        attributes.getStats().getSpecialAttack().setBaseValue(statCalculator(specieStats.getSpecialAttack(), attributes.getStats().getSpecialAttack(), level));
        attributes.getStats().getSpecialDefense().setBaseValue(statCalculator(specieStats.getSpecialDefense(), attributes.getStats().getSpecialDefense(), level));
        attributes.getStats().getSpeed().setBaseValue(statCalculator(specieStats.getSpeed(), attributes.getStats().getSpeed(), level));
        natureStatsMultiplier(attributes.getNature(), attributes);
        setInitialActualValue(attributes.getStats());
    }

    private static double statCalculator(int specieStat, BaseStat baseStat, int level) {
        double stat = 2 * specieStat;
        stat = stat + baseStat.getEffortValue() / 4d;
        stat = stat + baseStat.getIndividualValue() + 2d;
        stat = stat * (double) level / 100d;
        return stat + 5;
    }

    private static double lifeStatCalculator(Stats<Integer> specieStats, BaseStat baseStat, int level) {
        double life = 2 * specieStats.getHp();
        life = life + baseStat.getEffortValue() / 4d;
        life = life + baseStat.getIndividualValue() + 2d;
        life = life * (double) level / 100d;
        return life + 10 + level;
    }

    private static void natureStatsMultiplier(Natures nature, Attributes attributes) {
        Stats<BaseStat> stats = attributes.getStats();

        switch (nature) {
            case SERIOUS:
            case BASHFUL:
            case QUIRKY:
            case DOCILE:
            case HARDY:
                break;
            case LAX:
                stats.getDefense().setBaseValue(increaseStatCalculate(stats.getDefense().getBaseValue()));
                stats.getSpecialDefense().setBaseValue(decreaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                break;
            case ADAMANT:
                stats.getAttack().setBaseValue(increaseStatCalculate(stats.getAttack().getBaseValue()));
                stats.getSpecialAttack().setBaseValue(decreaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                break;
            case LONELY:
                stats.getAttack().setBaseValue(increaseStatCalculate(stats.getAttack().getBaseValue()));
                stats.getDefense().setBaseValue(decreaseStatCalculate(stats.getDefense().getBaseValue()));
                break;
            case CAREFUL:
                stats.getSpecialDefense().setBaseValue(increaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                stats.getSpecialAttack().setBaseValue(decreaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                break;
            case HASTY:
                stats.getSpeed().setBaseValue(increaseStatCalculate(stats.getSpeed().getBaseValue()));
                stats.getDefense().setBaseValue(decreaseStatCalculate(stats.getDefense().getBaseValue()));
                break;
            case IMPISH:
                stats.getDefense().setBaseValue(increaseStatCalculate(stats.getDefense().getBaseValue()));
                stats.getSpecialAttack().setBaseValue(decreaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                break;
            case BOLD:
                stats.getDefense().setBaseValue(increaseStatCalculate(stats.getDefense().getBaseValue()));
                stats.getAttack().setBaseValue(decreaseStatCalculate(stats.getAttack().getBaseValue()));
                break;
            case MILD:
                stats.getSpecialAttack().setBaseValue(increaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                stats.getDefense().setBaseValue(decreaseStatCalculate(stats.getDefense().getBaseValue()));
                break;
            case JOLLY:
                 stats.getSpeed().setBaseValue(increaseStatCalculate(stats.getSpeed().getBaseValue()));
                stats.getSpecialAttack().setBaseValue(decreaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                break;
            case RELAXED:
                stats.getDefense().setBaseValue(increaseStatCalculate(stats.getDefense().getBaseValue()));
                stats.getSpeed().setBaseValue(decreaseStatCalculate(stats.getSpeed().getBaseValue()));
                break;
            case GENTLE:
                stats.getSpecialDefense().setBaseValue(increaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                stats.getDefense().setBaseValue(decreaseStatCalculate(stats.getDefense().getBaseValue()));
                break;
            case TIMID:
                stats.getSpeed().setBaseValue(increaseStatCalculate(stats.getSpeed().getBaseValue()));
                stats.getAttack().setBaseValue(decreaseStatCalculate(stats.getAttack().getBaseValue()));
                break;
            case SASSY:
                stats.getSpecialDefense().setBaseValue(increaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                stats.getSpeed().setBaseValue(decreaseStatCalculate(stats.getSpeed().getBaseValue()));
                break;
            case RASH:
                stats.getSpecialAttack().setBaseValue(increaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                stats.getSpecialDefense().setBaseValue(decreaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                break;
            case NAUGHTY:
                stats.getAttack().setBaseValue(increaseStatCalculate(stats.getAttack().getBaseValue()));
                stats.getSpecialDefense().setBaseValue(decreaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                break;
            case NAIVE:
                stats.getSpeed().setBaseValue(increaseStatCalculate(stats.getSpeed().getBaseValue()));
                stats.getSpecialDefense().setBaseValue(decreaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                break;
            case BRAVE:
                stats.getAttack().setBaseValue(increaseStatCalculate(stats.getAttack().getBaseValue()));
                stats.getSpeed().setBaseValue(decreaseStatCalculate(stats.getSpeed().getBaseValue()));
                break;
            case CALM:
                stats.getSpecialDefense().setBaseValue(increaseStatCalculate(stats.getSpecialDefense().getBaseValue()));
                stats.getAttack().setBaseValue(decreaseStatCalculate(stats.getAttack().getBaseValue()));
                break;
            case MODEST:
                stats.getSpecialAttack().setBaseValue(increaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                stats.getAttack().setBaseValue(decreaseStatCalculate(stats.getAttack().getBaseValue()));
                break;
            case QUIET:
                stats.getSpecialAttack().setBaseValue(increaseStatCalculate(stats.getSpecialAttack().getBaseValue()));
                stats.getSpeed().setBaseValue(decreaseStatCalculate(stats.getSpeed().getBaseValue()));
                break;
        }
    }

    private static double increaseStatCalculate(double baseValue) {
        return baseValue * INCREASE_MULTIPLIER;
    }

    private static double decreaseStatCalculate(double baseValue) {
        return baseValue * DECREASE_MULTIPLIER;
    }

    private static void setInitialActualValue(Stats<BaseStat> stats) {
        stats.getHp().setActualValue(stats.getHp().getBaseValue());
        stats.getSpeed().setActualValue(stats.getSpeed().getBaseValue());
        stats.getDefense().setActualValue(stats.getDefense().getBaseValue());
        stats.getAttack().setActualValue(stats.getAttack().getBaseValue());
        stats.getSpecialDefense().setActualValue(stats.getSpecialDefense().getBaseValue());
        stats.getSpecialAttack().setActualValue(stats.getSpecialAttack().getBaseValue());
    }
}
