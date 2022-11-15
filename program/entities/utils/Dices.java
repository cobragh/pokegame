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
}
