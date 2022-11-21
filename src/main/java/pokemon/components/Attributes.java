package pokemon.components;

import pokemon.components.enums.Abilities;
import pokemon.components.enums.Natures;
import pokemon.components.enums.Types;

import java.util.List;

public class Attributes {
    private Abilities abilities;
    private Level level;
    private List<Types> types;
    private List<Effectiveness> effectiveness;
    private Stats<BaseStat> stats;
    private Natures nature;

    public Attributes() {}

    public Attributes(Abilities abilities, Level level, List<Types> types, List<Effectiveness> effectiveness, Stats<BaseStat> stats, Natures nature) {
        this.abilities = abilities;
        this.level = level;
        this.types = types;
        this.effectiveness = effectiveness;
        this.stats = stats;
        this.nature = nature;
    }

    public Abilities getAbility() {
        return abilities;
    }

    public void setAbility(Abilities abilities) {
        this.abilities = abilities;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
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

    public Stats<BaseStat> getStats() {
        return stats;
    }

    public void setStats(Stats<BaseStat> stats) {
        this.stats = stats;
    }

    public Natures getNature() {
        return nature;
    }

    public void setNature(Natures nature) {
        this.nature = nature;
    }
}
