import battle.out.effectiveness.TypeEffectiveness;
import pokemon.Attributes;
import pokemon.BaseStats;
import pokemon.PocketMonster;
import pokemon.Specie;
import pokemon.enums.Abilities;
import pokemon.enums.Genders;
import pokemon.enums.Items;
import pokemon.enums.Moves;
import pokemon.enums.SpecieCategory;
import pokemon.enums.Types;

import java.util.List;

public class Battle {
    public static void main(String[] args) {
        PocketMonster garchomp = new PocketMonster(1l, Genders.MALE, 255d, new Specie(445, new BaseStats(108, 130, 95, 80, 85, 102), 95d, 1.9, SpecieCategory.DRAGON, "test", "Garchomp"), "myGarchomp", Items.ASPEAR_BERRY, new Attributes(Abilities.SAND_VEIL, List.of(Types.FIRE, Types.FLYING), null, null), List.of(Moves.CUT.getMove(), Moves.EMBER.getMove(), Moves.POUND.getMove(), Moves.BUBBLE_BEAM.getMove()));
        TypeEffectiveness.setEffectiveness(garchomp.getAttributes());
        System.out.println(garchomp);
    }
}
