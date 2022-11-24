package utils;

import static utils.CalculatorConstants.FOUR;
import static utils.CalculatorConstants.HUNDRED;
import static utils.CalculatorConstants.ONE_SIXTEENTH;
import static utils.CalculatorConstants.TEN;
import static utils.CalculatorConstants.TWO;

public class CalculatorUtils {
        public static double lifeAttributeFormula(double specieHp, int effortValue, int individualValue, int level) {
            double life = TWO * specieHp + effortValue / FOUR + (individualValue + TWO);
            life = life * (double) level / HUNDRED;
            return life + TEN + level;
        }

    public static double basicAttributeFormula(double specieStat, int effortValue, int individualValue, int level) {
        double stat = TWO * specieStat + effortValue / FOUR + (individualValue + TWO);
        stat = stat * (double) level / HUNDRED;
        return stat + 5;
    }

    public static double weatherEveryEndTurnDamage(double currentHp, double baseHp) {
            return currentHp - (baseHp * ONE_SIXTEENTH);
    }

    public static double stageMultiplierFormula(double raise, double lower, double stat) {
            return stat * (raise / lower);
    }
}
