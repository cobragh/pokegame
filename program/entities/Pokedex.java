package program.entities;

import program.entities.types.enums.NAMES;
import program.entities.types.enums.TYPES;

public class Pokedex {
//Aqui haverá uma lista com as características dos pokemons achados
    private NAMES name;
    private TYPES type;
    private String description;
    private Double weight;
    private Double height;
    private TYPES weakness;


    public Pokedex(){}

    public Pokedex(NAMES name, TYPES type, String description, Double weight, Double height, TYPES weakness) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.weight = weight;
        this.height = height;
        this.weakness = weakness;
    }

    public NAMES getName() {
        return name;
    }

    public void setName(NAMES name) {
        this.name = name;
    }

    public TYPES getType() {
        return type;
    }

    public void setType(TYPES type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public TYPES getWeakness() {
        return weakness;
    }

    public void setWeakness(TYPES weakness) {
        this.weakness = weakness;
    }

    public void pokemons(NAMES name){
//      NORMAL
        if (name.equals(NAMES.SPEAROW)){
                setName(name);
                setHeight(0.3);
                setWeight(1.8);
                setType(TYPES.NORMAL);
                setDescription("Very docile. If attacked, it will often kick up sand to protect itself rather than fight back.");
                setWeakness(TYPES.ELECTRIC);
        }
        else if(name.equals(NAMES.RATTATA)){
            setName(name);
            setHeight(0.3);
            setWeight(1.8);
            setType(TYPES.NORMAL);
            setDescription("Will chew on anything with its fangs. If you see one, you can be certain that 40 more live in the area.");
            setWeakness(null); //FIGHTING
        }
        else if(name.equals(NAMES.ZANGOOSE)){
            setName(name);
            setHeight(1.3);
            setWeight(40.3);
            setType(TYPES.NORMAL);
            setDescription("Memories of battling its archrival Seviper are etched into every cell of Zangoose’s body. This Pokémon adroitly dodges attacks with incredible agility.");
            setWeakness(null); //FIGHTING
        }
        else if(name.equals(NAMES.TAUROS)){
            setName(name);
            setHeight(1.4);
            setWeight(88.4);
            setType(TYPES.NORMAL);
            setDescription("When Tauros begins whipping itself with its tails, it’s a warning that the Pokémon is about to charge with astounding speed.");
            setWeakness(null); //FIGHTING
        }
        else if(name.equals(NAMES.SPEAROW)) {
            setName(name);
            setHeight(0.3);
            setWeight(2.0);
            setType(TYPES.NORMAL);
            setDescription("Inept at flying high. However, it can fly around very fast to protect its territory.");
            setWeakness(TYPES.ELECTRIC);
        }

//      FIRE
    }

    @Override
    public String toString() {
        return
                "name = " + getName() +
                ", type = " + type +
                ", description = '" + description + '\'' +
                ", weight = " + weight + " kg" +
                ", height = " + height + " m";
    }
}
