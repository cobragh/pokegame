package pokemon;

import pokemon.components.Attributes;
import pokemon.components.Specie;
import pokemon.components.enums.Genders;
import pokemon.components.enums.Items;

public class PocketMonster {
    private long id;
    private String name;
    private Genders gender;
    private boolean shiny;
    private double happiness;
    private Specie specie;
    private Items heldItem;
    private Moves moves;
    private Attributes attributes;

    public PocketMonster() {}

    public PocketMonster(long id, String name, Genders gender, boolean shiny, double happiness, Specie specie, Items heldItem, Moves moves, Attributes attributes) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.shiny = shiny;
        this.happiness = happiness;
        this.specie = specie;
        this.heldItem = heldItem;
        this.moves = moves;
        this.attributes = attributes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Genders getGender() {
        return gender;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Items getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(Items heldItems) {
        this.heldItem = heldItems;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Moves getMoves() {
        return moves;
    }

    public void setMoves(Moves moves) {
        this.moves = moves;
    }
}
