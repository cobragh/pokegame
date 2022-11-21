package pokemon.components;

public class Level {
    private int level;
    private double actualExpPoints;
    private double totalExpPoints;
    private double requireExpPoints;

    public Level() {}

    public Level(int level, double actualExpPoints, double totalExpPoints, double requireExpPoints) {
        this.level = level;
        this.actualExpPoints = actualExpPoints;
        this.totalExpPoints = totalExpPoints;
        this.requireExpPoints = requireExpPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getActualExpPoints() {
        return actualExpPoints;
    }

    public void setActualExpPoints(double actualExpPoints) {
        this.actualExpPoints = actualExpPoints;
    }

    public double getTotalExpPoints() {
        return totalExpPoints;
    }

    public void setTotalExpPoints(double totalExpPoints) {
        this.totalExpPoints = totalExpPoints;
    }

    public double getRequireExpPoints() {
        return requireExpPoints;
    }

    public void setRequireExpPoints(double requireExpPoints) {
        this.requireExpPoints = requireExpPoints;
    }
}
