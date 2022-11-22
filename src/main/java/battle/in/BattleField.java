package battle.in;

import battle.in.enums.Terrain;
import battle.in.enums.Weather;
import pokemon.PocketMonster;

public class BattleField {
    private Weather weather;
    private Weather previousWeather;
    private Terrain terrain;
    private PocketMonster firstPokemon;
    private PocketMonster secondPokemon;

    public BattleField() {}

    public BattleField(Weather weather, Weather previousWeather, Terrain terrain, PocketMonster firstPokemon, PocketMonster secondPokemon) {
        this.weather = weather;
        this.previousWeather = previousWeather;
        this.terrain = terrain;
        this.firstPokemon = firstPokemon;
        this.secondPokemon = secondPokemon;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getPreviousWeather() {
        return previousWeather;
    }

    public void setPreviousWeather(Weather previousWeather) {
        this.previousWeather = previousWeather;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
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
}
