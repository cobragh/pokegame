package pokemon;

import pokemon.enums.Abilities;
import pokemon.enums.Types;

import java.util.List;

public class Attributes {
    private Abilities abilities;
    private List<Types> types;
    private List<Effectiveness> effectiveness;
    private Stats stats;

    public Attributes() {}

    public Attributes(Abilities abilities, List<Types> types, List<Effectiveness> effectiveness, Stats stats) {
        this.abilities = abilities;
        this.types = types;
        this.effectiveness = effectiveness;
        this.stats = stats;
    }

    public Abilities getAbility() {
        return abilities;
    }

    public void setAbility(Abilities abilities) {
        this.abilities = abilities;
    }

    public List<Types> getType() {
        return types;
    }

    public void setType(List<Types> types) {
        this.types = types;
    }

    public List<Effectiveness> getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(List<Effectiveness> effectiveness) {
        this.effectiveness = effectiveness;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
