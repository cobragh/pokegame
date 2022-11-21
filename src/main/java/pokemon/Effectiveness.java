package pokemon;

import pokemon.enums.Types;

public class Effectiveness implements Comparable<Effectiveness> {
    private Types types;
    private double effectiveness;

    public Types getType() {
        return types;
    }

    public void setType(Types types) {
        this.types = types;
    }

    public double getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(double effectiveness) {
        this.effectiveness = effectiveness;
    }

    public Effectiveness() {}

    public Effectiveness(Types types, double effectiveness) {
        this.types = types;
        this.effectiveness = effectiveness;
    }

    @Override
    public int compareTo(Effectiveness effectiveness) {
        return effectiveness.getType().name().compareTo(this.types.name());
    }
}
