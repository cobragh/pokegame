package pokemon.components;

import pokemon.components.enums.Status;

public class AdditionalEffect {
    private boolean hasAdditionalEffect;
    private Status status;
    private double chance;

    public AdditionalEffect() {}

    public AdditionalEffect(boolean hasAdditionalEffect, Status status, double chance) {
        this.hasAdditionalEffect = hasAdditionalEffect;
        this.status = status;
        this.chance = chance;
    }

    public boolean isHasAdditionalEffect() {
        return hasAdditionalEffect;
    }

    public void setHasAdditionalEffect(boolean hasAdditionalEffect) {
        this.hasAdditionalEffect = hasAdditionalEffect;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }
}
