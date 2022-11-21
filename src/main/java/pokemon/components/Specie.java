package pokemon.components;

import pokemon.components.enums.SpecieCategory;

public class Specie {
    private long pokedexEntry;
    private String name;
    private double height;
    private double weight;
    private SpecieCategory specieCategory;
    private String description;
    private Stats<Integer> baseStat;

    public Specie() {}

    public Specie(long pokedexEntry, String name, double height, double weight, SpecieCategory specieCategory, String description, Stats<Integer> baseStat) {
        this.pokedexEntry = pokedexEntry;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.specieCategory = specieCategory;
        this.description = description;
        this.baseStat = baseStat;
    }

    public long getPokedexEntry() {
        return pokedexEntry;
    }

    public void setPokedexEntry(long pokedexEntry) {
        this.pokedexEntry = pokedexEntry;
    }

    public Stats<Integer> getBaseStats() {
        return baseStat;
    }

    public void setBaseStats(Stats<Integer> baseStat) {
        this.baseStat = baseStat;
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
