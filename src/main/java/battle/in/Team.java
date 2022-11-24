package battle.in;

import pokemon.PocketMonster;

public class Team {
    private PocketMonster firstPokemon;
    private PocketMonster secondPokemon;
    private PocketMonster thirdPokemon;
    private PocketMonster fourthPokemon;
    private PocketMonster fifthPokemon;
    private PocketMonster sixthPokemon;

    public Team() {}

    public Team(PocketMonster firstPokemon, PocketMonster secondPokemon, PocketMonster thirdPokemon, PocketMonster fourthPokemon, PocketMonster fifthPokemon, PocketMonster sixthPokemon) {
        this.firstPokemon = firstPokemon;
        this.secondPokemon = secondPokemon;
        this.thirdPokemon = thirdPokemon;
        this.fourthPokemon = fourthPokemon;
        this.fifthPokemon = fifthPokemon;
        this.sixthPokemon = sixthPokemon;
    }

    public PocketMonster getFirstPokemon() {
        return firstPokemon;
    }

    public void setFirstPokemon(PocketMonster firstPokemon) {
        this.firstPokemon = firstPokemon;
    }

    public PocketMonster getSecondPokemon() {
        return secondPokemon;
    }

    public void setSecondPokemon(PocketMonster secondPokemon) {
        this.secondPokemon = secondPokemon;
    }

    public PocketMonster getThirdPokemon() {
        return thirdPokemon;
    }

    public void setThirdPokemon(PocketMonster thirdPokemon) {
        this.thirdPokemon = thirdPokemon;
    }

    public PocketMonster getFourthPokemon() {
        return fourthPokemon;
    }

    public void setFourthPokemon(PocketMonster fourthPokemon) {
        this.fourthPokemon = fourthPokemon;
    }

    public PocketMonster getFifthPokemon() {
        return fifthPokemon;
    }

    public void setFifthPokemon(PocketMonster fifthPokemon) {
        this.fifthPokemon = fifthPokemon;
    }

    public PocketMonster getSixthPokemon() {
        return sixthPokemon;
    }

    public void setSixthPokemon(PocketMonster sixthPokemon) {
        this.sixthPokemon = sixthPokemon;
    }
}
