package pokemon.components;

import pokemon.components.enums.MoveCategory;
import pokemon.components.enums.Types;

public class Move {
    private String name;
    private Types types;
    private int pp;
    private double power;
    private double accuracy;
    private MoveCategory category;
    private AdditionalEffect additionalEffect;

    public Move() {}

    public Move(String name, Types types, int pp, double power, double accuracy, MoveCategory category, AdditionalEffect additionalEffect) {
        this.name = name;
        this.types = types;
        this.pp = pp;
        this.power = power;
        this.accuracy = accuracy;
        this.category = category;
        this.additionalEffect = additionalEffect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Types getType() {
        return types;
    }

    public void setType(Types types) {
        this.types = types;
    }

    public MoveCategory getCategory() {
        return category;
    }

    public void setCategory(MoveCategory category) {
        this.category = category;
    }

    public AdditionalEffect getAdditionalEffect() {
        return additionalEffect;
    }

    public void setAdditionalEffect(AdditionalEffect additionalEffect) {
        this.additionalEffect = additionalEffect;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
