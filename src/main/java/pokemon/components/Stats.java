package pokemon.components;

public class Stats<T> {
    private T hp;
    private T attack;
    private T specialAttack;
    private T defense;
    private T specialDefense;
    private T speed;

    public Stats() {}

    public Stats(T hp, T attack, T specialAttack, T defense, T specialDefense, T speed) {
        this.hp = hp;
        this.attack = attack;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public T getHp() {
        return hp;
    }

    public void setHp(T hp) {
        this.hp = hp;
    }

    public T getAttack() {
        return attack;
    }

    public void setAttack(T attack) {
        this.attack = attack;
    }

    public T getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(T specialAttack) {
        this.specialAttack = specialAttack;
    }

    public T getDefense() {
        return defense;
    }

    public void setDefense(T defense) {
        this.defense = defense;
    }

    public T getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(T specialDefense) {
        this.specialDefense = specialDefense;
    }

    public T getSpeed() {
        return speed;
    }

    public void setSpeed(T speed) {
        this.speed = speed;
    }
}
