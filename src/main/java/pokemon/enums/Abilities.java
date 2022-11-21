package pokemon.enums;

import java.util.Objects;

public enum Abilities {
    STENCH("By releasing a stench when attacking, the Pokémon may cause the target to flinch."),
    DRIZZLE("The Pokémon makes it rain when it enters a battle."),
    SPEED_BOOST("The Pokémon's Speed stat is boosted every turn."),
    BATTLE_ARMOR("Hard armor protects the Pokémon from critical hits."),
    STURDY("The Pokémon cannot be knocked out by a single hit as long as its HP is full. One-hit KO moves will also fail to knock it out."),
    DAMP("The Pokémon dampens its surroundings, preventing all Pokémon from using explosive moves such as Self-Destruct"),
    LIMBER("The Pokémon's limber body prevents it from being paralyzed."),
    SAND_VEIL("Boosts the Pokémon's evasiveness in a sandstorm."),
    STATIC("The Pokémon is charged with static electricity and may paralyze attackers that make direct contact with it."),
    VOLT_ABSORB("If hit by an Electric-type move, the Pokémon has its HP restored instead of taking damage."),
    WATER_ABSORB("If hit by a Water-type move, the Pokémon has its HP restored instead of taking damage"),
    OBLIVIOUS("The Pokémon is oblivious, keeping it from being infatuated, falling for taunts, or being affected by Intimidate."),
    CLOUD_NINE("Eliminates the effects of weather."),
    COMPOUND_EYES("The Pokémon's compound eyes boost its accuracy."),
    INSOMNIA("The Pokémon's insomnia prevents it from falling asleep."),
    COLOR_CHANGE("The Pokémon's type becomes the type of the move used on it."),
    IMMUNITY("The Pokémon's immune system prevents it from being poisoned."),
    FLASH_FIRE("If hit by a Fire-type move, the Pokémon absorbs the flames and uses them to power up its own Fire-type moves."),
    SHIELD_DUST("Protective dust shields the Pokémon from the additional effects of moves."),
    OWN_TEMPO("The Pokémon sticks to its own tempo, preventing it from becoming confused or being affected by Intimidate."),
    SUCTION_CUPS("The Pokémon uses suction cups to stay in one spot. This protects it from moves and items that would force it to switch out."),
    INTIMIDATE("When the Pokémon enters a battle, it intimidates opposing Pokémon and makes them cower, lowering their Attack stats."),
    SHADOW_TAG("The Pokémon steps on the opposing Pokémon's shadows to prevent them from fleeing or switching out."),
    ROUGH_SKIN("The Pokémon's rough skin damages attackers that make direct contact with it."),
    WONDER_GUARD("Its mysterious power only lets supereffective moves hit the Pokémon."),
    LEVITATE("By floating in the air, the Pokémon receives full immunity to all Ground-type moves."),
    EFFECT_SPORE("Contact with the Pokémon may inflict poison, sleep, or paralysis on the attacker."),
    SYNCHRONIZE("If the Pokémon is burned, paralyzed, or poisoned by another Pokémon, that Pokémon will be inflicted with the same status condition."),
    CLEAR_BODY("Prevents other Pokémon's moves or Abilities from lowering the Pokémon's stats."),
    NATURAL_CURE("The Pokémon's status conditions are cured when it switches out."),
    LIGHTNING_ROD("The Pokémon draws in all Electric-type moves. Instead of taking damage from them, its Sp. Atk stat is boosted."),
    SERENE_GRACE("Raises the likelihood of additional effects occurring when the Pokémon uses its moves"),
    SWIFT_SWIM("Boosts the Pokémon's Speed stat in rain."),
    CHLOROPHYLL("Boosts the Pokémon's Speed stat in harsh sunlight."),
    ILLUMINATE("Raises the likelihood of meeting wild Pokémon by illuminating the surroundings."),
    TRACE("When it enters a battle, the Pokémon copies an opposing Pokémon's Ability"),
    HUGE_POWER("Doubles the Pokémon's Attack stat."),
    POISON_POINT("Contact with the Pokémon may poison the attacker."),
    INNER_FOCUS("The Pokémon's intense focus prevents it from flinching or being affected by Intimidate."),
    MAGMA_ARMOR("The Pokémon's hot magma coating prevents it from being frozen."),
    WATER_VEIL("The Pokémon's water veil prevents it from being burned."),
    MAGNET_PULL("Prevents Steel-type Pokémon from fleeing by pulling them in with magnetism."),
    SOUNDPROOF("Soundproofing gives the Pokémon full immunity to all sound-based moves."),
    RAIN_DISH("The Pokémon gradually regains HP in rain."),
    SAND_STREAM("The Pokémon summons a sandstorm when it enters a battle."),
    PRESSURE("Puts other Pokémon under pressure, causing them to expend more PP to use their moves."),
    THICK_FAT("The Pokémon is protected by a layer of thick fat, which halves the damage taken from Fire- and Ice-type moves."),
    EARLY_BIRD("The Pokémon awakens from sleep twice as fast as other Pokémon."),
    FLAME_BODY("Contact with the Pokémon may burn the attacker."),
    RUN_AWAY("Enables a sure getaway from wild Pokémon."),
    KEEN_EYE("The Pokémon's keen eyes prevent its accuracy from being lowered."),
    HYPER_CUTTER("The Pokémon's prized, mighty pincers prevent other Pokémon from lowering its Attack stat."),
    PICKUP("The Pokémon may pick up an item another Pokémon used during a battle. It may pick up items outside of battle, too."),
    TRUANT("Each time the Pokémon uses a move, it spends the next turn loafing around."),
    HUSTLE("Boosts the Pokémon's Attack stat but lowers its accuracy."),
    CUTE_CHARM("The Pokémon may infatuate attackers that make direct contact with it."),
    PLUS("Boosts the Sp. Atk stat of the Pokémon if an ally with the Plus or Minus Ability is also in battle."),
    MINUS("Boosts the Sp. Atk stat of the Pokémon if an ally with the Plus or Minus Ability is also in battle."),
    FORECAST("The Pokémon transforms with the weather to change its type to Water, Fire, or Ice."),
    STICKY_HOLD("The Pokémon's held items cling to its sticky body and cannot be removed by other Pokémon."),
    SHED_SKIN("The Pokémon may cure its own status conditions by shedding its skin."),
    GUTS("It's so gutsy that having a status condition boosts the Pokémon's Attack stat."),
    MARVEL_SCALE("The Pokémon's marvelous scales boost its Defense stat if it has a status condition."),
    LIQUID_OOZE("The strong stench of the Pokémon's oozed liquid damages attackers that use HP-draining moves."),
    OVERGROW("Powers up Grass-type moves when the Pokémon's HP is low."),
    BLAZE("Powers up Fire-type moves when the Pokémon's HP is low."),
    TORRENT("Powers up Water-type moves when the Pokémon's HP is low."),
    SWARM("Powers up Bug-type moves when the Pokémon's HP is low."),
    ROCK_HEAD("Protects the Pokémon from recoil damage."),
    DROUGHT("Turns the sunlight harsh when the Pokémon enters a battle."),
    ARENA_TRAP("Prevents opposing Pokémon from fleeing from battle."),
    VITAL_SPIRIT("The Pokémon is full of vitality, and that prevents it from falling asleep."),
    WHITE_SMOKE("The Pokémon is protected by its white smoke, which prevents other Pokémon from lowering its stats."),
    PURE_POWER("Using its pure power, the Pokémon doubles its Attack stat."),
    SHELL_ARMOR("A hard shell protects the Pokémon from critical hits."),
    AIR_LOCK("Eliminates the effects of weather.");

    private String description;

    private Abilities(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getAbility() {
        String str = this.name();
        String category = new StringBuilder(str.substring(0, 1).toUpperCase())
                .append(str.substring(1).toLowerCase())
                .toString().replace('_', ' ');
        char[] categoryChars = category.toCharArray();

        for (int i = 0; i < categoryChars.length - 1; i++) {
            if (Objects.equals(categoryChars[i], ' ')) {
                categoryChars[i+1] = Character.toUpperCase(categoryChars[i+1]);
            }
        }

        return String.valueOf(categoryChars);
    }
}
