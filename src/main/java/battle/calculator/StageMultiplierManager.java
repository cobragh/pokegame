package battle.calculator;

import pokemon.components.BaseStat;

import java.util.Objects;

import static utils.CalculatorConstants.EIGHT;
import static utils.CalculatorConstants.FIVE;
import static utils.CalculatorConstants.FIVE_LESS;
import static utils.CalculatorConstants.FOUR;
import static utils.CalculatorConstants.FOUR_LESS;
import static utils.CalculatorConstants.ONE;
import static utils.CalculatorConstants.ONE_LESS;
import static utils.CalculatorConstants.SEVEN;
import static utils.CalculatorConstants.SIX;
import static utils.CalculatorConstants.SIX_LESS;
import static utils.CalculatorConstants.THREE;
import static utils.CalculatorConstants.THREE_LESS;
import static utils.CalculatorConstants.TWO;
import static utils.CalculatorConstants.TWO_LESS;
import static utils.CalculatorConstants.ZERO;
import static utils.CalculatorUtils.stageMultiplierFormula;

public class StageMultiplierManager {

    public static void increaseStage(BaseStat stat, int amount) {
        int previousMultiplier = stat.getStageMultiplier();
        int currentMultiplier = previousMultiplier + amount;
        if (currentMultiplier <= SIX) {
            stat.setStageMultiplier(currentMultiplier);
            stat.setActualValue(stageMultiplierLogic(previousMultiplier, currentMultiplier, stat.getBaseValue(), stat.getActualValue()));
        } else {
            //TODO not implemented yet
        }
    }

    public static void decreaseStage(BaseStat stat, int amount) {
        int previousMultiplier = stat.getStageMultiplier();
        int currentMultiplier = previousMultiplier - amount;
        if (currentMultiplier >= SIX_LESS) {
            stat.setStageMultiplier(currentMultiplier);
            stat.setActualValue(stageMultiplierLogic(previousMultiplier, currentMultiplier, stat.getBaseValue(), stat.getActualValue()));
        } else {
            //TODO not implemented yet
        }
    }

    public static void resetStage(BaseStat stat) {
        int previousMultiplier = stat.getStageMultiplier();
        stat.setStageMultiplier(ZERO);
        stat.setActualValue(stageMultiplierLogic(previousMultiplier,ZERO, stat.getBaseValue(), stat.getActualValue()));
    }

    private static double stageMultiplierLogic(int previousMultiplier, int currentMultiplier, double baseValue, double actualValue) {
        if (Objects.equals(previousMultiplier, ZERO)) {
            return stageMultiplierCalculator(currentMultiplier, actualValue);
        } else {
            if (previousMultiplier > ZERO) {
                return stageMultiplierCalculator(-previousMultiplier, actualValue);
            } else {
                return stageMultiplierCalculator(+previousMultiplier, actualValue);
            }
        }
    }

    private static double stageMultiplierCalculator(int multiplier, double stat) {
        double raise = TWO;
        double lower = TWO;

        switch (multiplier) {
            case ZERO:
                break;
            case ONE:
                raise++;
                break;
            case TWO:
                raise = FOUR;
                break;
            case THREE:
                raise = FIVE;
                break;
            case FOUR:
                raise = SIX;
                break;
            case FIVE:
                raise = SEVEN;
                break;
            case SIX:
                raise = EIGHT;
                break;
            case ONE_LESS:
                lower++;
                break;
            case TWO_LESS:
                lower = FOUR;
                break;
            case THREE_LESS:
                lower = FIVE;
                break;
            case FOUR_LESS:
                lower = SIX;
                break;
            case FIVE_LESS:
                lower = SEVEN;
                break;
            case SIX_LESS:
                lower = EIGHT;
                break;
        }

        return stageMultiplierFormula(raise, lower, stat);
    }
}
