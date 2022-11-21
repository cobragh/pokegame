package pokemon.enums;

import java.util.Objects;

public enum SpecieCategory {
    SEED,
    LIZARD,
    FLAME,
    TINY_TURTLE,
    TURTLE,
    SHELLFISH,
    WORM,
    BUTTERFLY,
    HAIRY_BUG,
    POISON_BEE,
    TINY_BIRD,
    BIRD,
    MOUSE,
    BEAK,
    SNAKE,
    COBRA,
    POISON_PIN,
    DRILL,
    FAIRY,
    FOX,
    BALLOON,
    BAT,
    WEED,
    FLOWER,
    MUSHROOM,
    INSECT,
    POISON_MOTH,
    MOLE,
    SCRATCH_CAT,
    CLASSY_CAT,
    DUCK,
    PIG_MONKEY,
    PUPPY,
    LEGENDARY,
    TADPOLE,
    PSI,
    SUPERPOWER,
    FLYCATCHER,
    JELLYFISH,
    ROCK,
    MEGATON,
    FIRE_HORSE,
    DOPEY,
    HERMIT_CRAB,
    MAGNET,
    WILD_DUCK,
    TWIN_BIRD,
    TRIPLE_BIRD,
    SEA_LION,
    SLUDGE,
    BIVALVE,
    GAS,
    SHADOW,
    ROCK_SNAKE,
    HYPNOSIS,
    RIVER_CRAB,
    PINCER,
    BALL,
    EGG,
    COCONUT,
    LONELY,
    BONE_KEEPER,
    KICKING,
    PUNCHING,
    LICKING,
    POISON_GAS,
    SPIKES,
    VINE,
    PARENT,
    DRAGON,
    GOLDFISH,
    STAR_SHAPE,
    MYSTERIOUS,
    BARRIER,
    MANTIS,
    HUMAN_SHAPE,
    ELECTRIC,
    SPITFIRE,
    STAG_BEETLE,
    WILD_BULL,
    FISH,
    ATROCIOUS,
    TRANSPORT,
    TRANSFORM,
    EVOLUTION,
    BUBBLE_JET,
    LIGHTING,
    VIRTUAL,
    SPIRAL,
    FOSSIL,
    SLEEPING,
    FREEZE,
    GENETIC,
    NEW_SPECIES;
    private SpecieCategory() {}

    public String getCategory() {
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
