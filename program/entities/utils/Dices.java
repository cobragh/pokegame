package program.entities.utils;

public class Dices {
    public int diceWalk(){
        int numberWalk = 0;
        int minWalk = 0;
        int maxWalk = 10;
        numberWalk = (int) (Math.random()*(maxWalk-minWalk+1)+minWalk);

        int numberDice = 0;
        int minDice = 0;
        int maxDice = 10;
        numberDice = (int) (Math.random()*(maxDice-minDice+1)+minDice);

        if(numberWalk == numberDice){
            return 0;
        }
        return 1;
    }

    public int shinnyProbability(){
        //PRECISO ACHAR UMA FORMA DE CONCATENAR A PALAVRA "SHINNY" NO FINAL DO NOME DO POKEMON
//        PQ SAO ENUMS E TERIA QUE REFAZER A LISTA DE NOMES DE POKEMONS COMPLETA ADICIONANDO O SHINNY NO FINAL
        int shinny = 0;
        int minProb = 0;
        int maxProb = 200;
        shinny = (int) (Math.random()*(maxProb-minProb+1)+minProb);

        int numberWalk = 0;
        int minWalk = 0;
        int maxWalk = 10;
        numberWalk = (int) (Math.random()*(maxWalk-minWalk+1)+minWalk);

        if (shinny == numberWalk){
            return 1;
        }
        return 0;
    }

    public int lendaryProbability(){
        int lendary = 0;
        int minProb = 0;
        int maxProb = 200;
        lendary = (int) (Math.random()*(maxProb-minProb+1)+minProb);

        int numberWalk = 0;
        int minWalk = 0;
        int maxWalk = 10;
        numberWalk = (int) (Math.random()*(maxWalk-minWalk+1)+minWalk);
        if (lendary == numberWalk){
            return 1;
        }
        return 0;
    }
}
