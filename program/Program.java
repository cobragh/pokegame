package program;


import program.entities.Pokedex;
import program.entities.Pokemon;
import program.entities.types.enums.NAMES;
import program.entities.types.enums.TYPES;
import program.entities.utils.Dices;
import program.entities.utils.StatsGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StatsGenerator statsGenerator = new StatsGenerator();
        Dices dices = new Dices();
        Pokedex pokedex = new Pokedex();
        List<Pokedex> pokemons = new ArrayList<>();
        Pokedex pokedex1 = new Pokedex();

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Andar");
        System.out.println("2 - Pokedex");
        System.out.println("3 - Ver PokeBag");
        System.out.print("Digite: ");
        int choise = sc.nextInt();
        if (choise == 1){
            while(dices.diceWalk() != 0){
                System.out.println("=====================");
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Andar");
                System.out.println("2 - Pokedex");
                System.out.println("3 - Ver PokeBag");
                System.out.print("Digite: ");
                int numberLoop = sc.nextInt();
            }
            System.out.println("=========================================");
            TYPES typeGen = statsGenerator.type();
            TYPES type = typeGen;
            NAMES names = statsGenerator.name(type);
            Pokemon pokemon = new Pokemon(statsGenerator.name(type),
                    statsGenerator.saude(), statsGenerator.attack(), statsGenerator.shield(), type);
            System.out.println("VOCÊ ACHOU UM " + pokemon.getName() + "!!!!");
            System.out.println("Stats do pokemon achado:");
            System.out.println(pokemon);
            pokedex1.pokemons(pokemon.getName()); //Adicionando as informacoes para passar para a pokedex.
            pokemons.add(pokedex1); //Adicionando o pokemon na lista da pokedex.
        }
        else if(choise == 2){
            System.out.println(pokemons);
        }
    }
}
