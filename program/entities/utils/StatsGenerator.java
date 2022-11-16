package program.entities.utils;

import com.sun.jdi.Value;
import program.entities.types.enums.NAMES;
import program.entities.types.enums.TYPES;

public class StatsGenerator {
    Dices dice = new Dices();
    public NAMES name(TYPES type){
        int min = 1;
        int max = 6;
        int choose = (int) (Math.random()*(max-min+1)+min);
        switch(type){
            case NORMAL:
                switch (choose) {
                    case 1: return NAMES.PIDGEY;
                    case 2: return NAMES.RATTATA;
                    case 3: return NAMES.ZANGOOSE;
                    case 4: return NAMES.TAUROS;
                    case 5: return NAMES.SPEAROW;
                }
            case FIRE:
                switch (choose) {
                    case 1: return NAMES.CHARMANDER;
                    case 2: return NAMES.PONYTA;
                    case 3: return NAMES.VULPIX;
                    case 4: return NAMES.TORCHIC;
                    case 5: return NAMES.MONFERNO;
                }
            case WATER:
                switch (choose) {
                    case 1: return NAMES.SQUIRTLE;
                    case 2: return NAMES.HORSEA;
                    case 3: return NAMES.MAGIKARP;
                    case 4: return NAMES.POLIWAG;
                    case 5: return NAMES.TENTACOOL;
                }
            case GRASS:
                switch (choose) {
                    case 1: return NAMES.BULBASSAUR;
                    case 2: return NAMES.BAYLEEF;
                    case 3: return NAMES.BELLSPROUT;
                    case 4: return NAMES.CHIKORITA;
                    case 5: return NAMES.PARAS;
                }
            case ELECTRIC:
                switch (choose) {
                    case 1: return NAMES.PIKACHU;
                    case 2: return NAMES.ELEKID;
                    case 3: return NAMES.MAGNEMITE;
                    case 4: return NAMES.VOLTORB;
                    case 5: return NAMES.AMPHAROS;
                }
            case ROCK:
                switch (choose) {
                    case 1: return NAMES.GEODUDE;
                    case 2: return NAMES.ONIX;
                    case 3: return NAMES.LARVITAR;
                    case 4: return NAMES.KABUTO;
                    case 5: return NAMES.GOLEM;
                }
            }
            return name(type());
    }
    public int saude() {
        int saude = 0;
        int min = 0;
        int max = 0;
        if (dice.shinnyProbability() == 1) {
            min = 145;
            max = 150;
            saude = (int) (Math.random() * (max - min + 1) + min);
            return saude;
        }
        else {
            min = 120;
            max = 150;
            saude = (int) (Math.random() * (max - min + 1) + min);
            return saude;
        }
    }
    public int attack(){
        int attack = 0;
        int min = 0;
        int max = 0;
        if (dice.shinnyProbability() == 1) {
            min = 75;
            max = 80;
            attack = (int) (Math.random() * (max - min + 1) + min);
            return attack;
        }
        else{
            min = 40;
            max = 80;
            attack = (int) (Math.random() * (max - min + 1) + min);
            return attack;
        }
    }
    public int shield(){
        int shield = 0;
        int min = 0;
        int max = 0;
        if (dice.shinnyProbability() == 1) {
            min = 75;
            max = 80;
            shield = (int) (Math.random() * (max - min + 1) + min);
            return shield;
        }
        else{
            min = 75;
            max = 80;
            shield = (int) (Math.random() * (max - min + 1) + min);
            return shield;
        }
    }


    public TYPES type(){
        int min = 1;
        int max = 6;
        int choose = (int) (Math.random()*(max-min+1)+min);
        switch(choose){
            case 1: return TYPES.NORMAL;
            case 2: return TYPES.FIRE;
            case 3: return TYPES.WATER;
            case 4: return TYPES.GRASS;
            case 5: return TYPES.ELECTRIC;
            case 6: return TYPES.ROCK;
        }
        return type();
    }
}
