package pokemon.calculator;

import pokemon.components.Attributes;
import pokemon.components.BaseStat;
import pokemon.components.Stats;
import pokemon.components.enums.Natures;

public class AttributeManager {
    public static void attributeCalculator(Stats<Integer> specieStats, Attributes attributes) {
        int level = attributes.getLevel().getLevel();

        attributes.getStats().getHp().setActualValue(lifeStatCalculator(specieStats, attributes.getStats().getHp(), level));
        attributes.getStats().getAttack().setActualValue(statCalculator(specieStats.getAttack(), attributes.getStats().getAttack(), level));
        attributes.getStats().getDefense().setActualValue(statCalculator(specieStats.getDefense(), attributes.getStats().getDefense(), level));
        attributes.getStats().getSpecialAttack().setActualValue(statCalculator(specieStats.getSpecialAttack(), attributes.getStats().getSpecialAttack(), level));
        attributes.getStats().getSpecialDefense().setActualValue(statCalculator(specieStats.getSpecialDefense(), attributes.getStats().getSpecialDefense(), level));
        attributes.getStats().getSpeed().setActualValue(statCalculator(specieStats.getSpeed(), attributes.getStats().getSpeed(), level));
        natureStatsMultiplier(attributes.getNature(), attributes);
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
                stats.getDefense().setActualValue(increaseStatCalculate(stats.getDefense().getActualValue()));
                stats.getSpecialDefense().setActualValue(decreaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                break;
            case ADAMANT:
                stats.getAttack().setActualValue(increaseStatCalculate(stats.getAttack().getActualValue()));
                stats.getSpecialAttack().setActualValue(decreaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                break;
            case LONELY:
                stats.getAttack().setActualValue(increaseStatCalculate(stats.getAttack().getActualValue()));
                stats.getDefense().setActualValue(decreaseStatCalculate(stats.getDefense().getActualValue()));
                break;
            case CAREFUL:
                stats.getSpecialDefense().setActualValue(increaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                stats.getSpecialAttack().setActualValue(decreaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                break;
            case HASTY:
                stats.getSpeed().setActualValue(increaseStatCalculate(stats.getSpeed().getActualValue()));
                stats.getDefense().setActualValue(decreaseStatCalculate(stats.getDefense().getActualValue()));
                break;
            case IMPISH:
                stats.getDefense().setActualValue(increaseStatCalculate(stats.getDefense().getActualValue()));
                stats.getSpecialAttack().setActualValue(decreaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                break;
            case BOLD:
                stats.getDefense().setActualValue(increaseStatCalculate(stats.getDefense().getActualValue()));
                stats.getAttack().setActualValue(decreaseStatCalculate(stats.getAttack().getActualValue()));
                break;
            case MILD:
                stats.getSpecialAttack().setActualValue(increaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                stats.getDefense().setActualValue(decreaseStatCalculate(stats.getDefense().getActualValue()));
                break;
            case JOLLY:
                 stats.getSpeed().setActualValue(increaseStatCalculate(stats.getSpeed().getActualValue()));
                stats.getSpecialAttack().setActualValue(decreaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                break;
            case RELAXED:
                stats.getDefense().setActualValue(increaseStatCalculate(stats.getDefense().getActualValue()));
                stats.getSpeed().setActualValue(decreaseStatCalculate(stats.getSpeed().getActualValue()));
                break;
            case GENTLE:
                stats.getSpecialDefense().setActualValue(increaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                stats.getDefense().setActualValue(decreaseStatCalculate(stats.getDefense().getActualValue()));
                break;
            case TIMID:
                stats.getSpeed().setActualValue(increaseStatCalculate(stats.getSpeed().getActualValue()));
                stats.getAttack().setActualValue(decreaseStatCalculate(stats.getAttack().getActualValue()));
                break;
            case SASSY:
                stats.getSpecialDefense().setActualValue(increaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                stats.getSpeed().setActualValue(decreaseStatCalculate(stats.getSpeed().getActualValue()));
                break;
            case RASH:
                stats.getSpecialAttack().setActualValue(increaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                stats.getSpecialDefense().setActualValue(decreaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                break;
            case NAUGHTY:
                stats.getAttack().setActualValue(increaseStatCalculate(stats.getAttack().getActualValue()));
                stats.getSpecialDefense().setActualValue(decreaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                break;
            case NAIVE:
                stats.getSpeed().setActualValue(increaseStatCalculate(stats.getSpeed().getActualValue()));
                stats.getSpecialDefense().setActualValue(decreaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                break;
            case BRAVE:
                stats.getAttack().setActualValue(increaseStatCalculate(stats.getAttack().getActualValue()));
                stats.getSpeed().setActualValue(decreaseStatCalculate(stats.getSpeed().getActualValue()));
                break;
            case CALM:
                stats.getSpecialDefense().setActualValue(increaseStatCalculate(stats.getSpecialDefense().getActualValue()));
                stats.getAttack().setActualValue(decreaseStatCalculate(stats.getAttack().getActualValue()));
                break;
            case MODEST:
                stats.getSpecialAttack().setActualValue(increaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                stats.getAttack().setActualValue(decreaseStatCalculate(stats.getAttack().getActualValue()));
                break;
            case QUIET:
                stats.getSpecialAttack().setActualValue(increaseStatCalculate(stats.getSpecialAttack().getActualValue()));
                stats.getSpeed().setActualValue(decreaseStatCalculate(stats.getSpeed().getActualValue()));
                break;
        }
    }

    private static double increaseStatCalculate(double actualValue) {
        return actualValue * 1.1;
    }

    private static double decreaseStatCalculate(double actualValue) {
        return actualValue * 0.9;
    }
}
