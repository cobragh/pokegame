package pokemon.components;

public class BaseStat {
    private int effortValue;
    private int individualValue;
    private double actualValue;

    public BaseStat() {}

    public BaseStat(int effortValue, int individualValue) {
        this.effortValue = effortValue;
        this.individualValue = individualValue;
    }

    public BaseStat(int effortValue, int individualValue, double actualValue) {
        this.effortValue = effortValue;
        this.individualValue = individualValue;
        this.actualValue = actualValue;
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
}
