import pokemon.Moves;
import pokemon.PocketMonster;
import pokemon.calculator.AttributeManager;
import pokemon.calculator.TypeEffectivenessManager;
import pokemon.components.Attributes;
import pokemon.components.BaseStat;
import pokemon.components.Level;
import pokemon.components.Specie;
import pokemon.components.Stats;
import pokemon.components.enums.Abilities;
import pokemon.components.enums.Genders;
import pokemon.components.enums.Items;
import pokemon.components.enums.MoveList;
import pokemon.components.enums.Natures;
import pokemon.components.enums.SpecieCategory;
import pokemon.components.enums.Types;

import java.util.List;

public class Battle {
    public static void main(String[] args) {
        Stats<Integer> charizardStats = new Stats<>(78, 84, 109, 78, 85, 100);
        Specie charizardSpecie = new Specie(006, "Charizard", 1.7, 90.5, SpecieCategory.DRAGON, "It is said that Charizard's fire burns hotter if it has experienced harsh battles.", charizardStats);
        Moves charizardMoves = new Moves(MoveList.CUT.getMove(), MoveList.EMBER.getMove(), MoveList.POUND.getMove(), MoveList.TACKLE.getMove());
        Stats<BaseStat> charizardStat = new Stats<>(new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31), new BaseStat(252, 31));
        Level charizardLevel = new Level(50, 0, 0, 0);
        Attributes charizardAttributes = new Attributes(Abilities.BLAZE, charizardLevel, List.of(Types.FIRE, Types.FLYING), null, charizardStat, Natures.JOLLY);
        PocketMonster charizard = new PocketMonster(1L, "Charizard", Genders.MALE, true, 255d, charizardSpecie, Items.ASPEAR_BERRY, charizardMoves, charizardAttributes);
        TypeEffectivenessManager.typeEffectivenessCalculator(charizard.getAttributes());
        AttributeManager.attributeCalculator(charizard.getSpecie().getBaseStats(), charizard.getAttributes());
        System.out.println(charizard);
    }
}
