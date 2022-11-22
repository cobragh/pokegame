package pokemon.components;

public class BaseStat {
    private int effortValue;
    private int individualValue;
    private double actualValue;
    private double baseValue;
    private int stageMultiplier;

    public BaseStat() {}

    public BaseStat(int effortValue, int individualValue) {
        this.effortValue = effortValue;
        this.individualValue = individualValue;
        this.stageMultiplier = 0;
    }

    public BaseStat(int effortValue, int individualValue, double actualValue, double baseValue, int stageMultiplier) {
        this.effortValue = effortValue;
        this.individualValue = individualValue;
        this.actualValue = actualValue;
        this.baseValue = baseValue;
        this.stageMultiplier = stageMultiplier;
    }

    public int getEffortValue() {
        return effortValue;
    }

    public void setEffortValue(int effortValue) {
        this.effortValue = effortValue;
    }

    public int getIndividualValue() {
        return individualValue;
    }

    public void setIndividualValue(int individualValue) {
        this.individualValue = individualValue;
    }

    public double getActualValue() {
        return actualValue;
    }

    public void setActualValue(double actualValue) {
        this.actualValue = actualValue;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double actualValue) {
        this.baseValue = actualValue;
    }

    public int getStageMultiplier() {
        return stageMultiplier;
    }

    public void setStageMultiplier(int stageMultiplier) {
        this.stageMultiplier = stageMultiplier;
    }
}
