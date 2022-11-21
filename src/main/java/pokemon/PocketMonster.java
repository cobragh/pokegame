package pokemon;

import battle.out.effectiveness.TypeEffectiveness;
import pokemon.enums.*;

import java.util.List;

public class PocketMonster {
    private long id;
    private Genders genders;
    private double happiness;
    private Specie specie;
    private String name;
    private Items heldItems;
    private Attributes attributes;
    private List<Move> moves;

    public PocketMonster() {}

    public PocketMonster(long id, Genders genders, double happiness, Specie specie, String name, Items heldItems, Attributes attributes, List<Move> moves) {
        this.id = id;
        this.genders = genders;
        this.happiness = happiness;
        this.specie = specie;
        this.name = name;
        this.heldItems = heldItems;
        this.attributes = attributes;
        this.moves = moves;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Genders getGender() {
        return genders;
    }

    public void setGender(Genders genders) {
        this.genders = genders;
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
        return heldItems;
    }

    public void setHeldItem(Items heldItems) {
        this.heldItems = heldItems;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
}
