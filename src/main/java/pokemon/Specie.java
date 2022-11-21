package pokemon;

import pokemon.enums.SpecieCategory;

public class Specie {
    private long pokedexEntry;
    private BaseStats baseStats;
    private double weight;
    private double height;
    private SpecieCategory specieCategory;
    private String description;
    private String name;

    public Specie() {}

    public Specie(long pokedexEntry, BaseStats baseStats, double weight, double height, SpecieCategory specieCategory, String description, String name) {
        this.pokedexEntry = pokedexEntry;
        this.baseStats = baseStats;
        this.weight = weight;
        this.height = height;
        this.specieCategory = specieCategory;
        this.description = description;
        this.name = name;
    }

    public long getPokedexEntry() {
        return pokedexEntry;
    }

    public void setPokedexEntry(long pokedexEntry) {
        this.pokedexEntry = pokedexEntry;
    }

    public BaseStats getBaseStats() {
        return baseStats;
    }

    public void setBaseStats(BaseStats baseStats) {
        this.baseStats = baseStats;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public SpecieCategory getSpecieCategory() {
        return specieCategory;
    }

    public void setSpecieCategory(SpecieCategory specieCategory) {
        this.specieCategory = specieCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
