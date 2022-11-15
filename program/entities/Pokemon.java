package program.entities;

import program.entities.types.enums.NAMES;
import program.entities.types.enums.TYPES;

public class Pokemon {
    private NAMES name;
    private int health;
    private int attack;
    private int shield;
    private TYPES type;

    public Pokemon(NAMES name, int health, int attack, int shield, TYPES type) {
        this.name =  name;
        this.health = health;
        this.attack = attack;
        this.shield = shield;
        this.type = type;
    }


    public NAMES getName() {
        return name;
    }

    public void setName(String name) {
        this.name = NAMES.valueOf(name);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getShield() {
        return shield;
    }

    public TYPES getType() {
        return type;
    }

    public void setType(TYPES type) {
        this.type = type;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }



    public String toString(){
        return  "Name: " + getName() +
                ", Health: " + getHealth() +
                        ", Attack: " + getAttack() +
                        ", Shield: " + getShield() +
                        ", Type: " + getType();
    }
}
