import java.util.Random;

public class Dice {
        public int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
    public Integer diceRoll()
    {
        int sumOfDice = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sumOfDice += (int) Math.floor(Math.random() * 6) + 1;
        }
        return sumOfDice;
    }
    public int getNumberOfDice()
    {
        return numberOfDice;
    }
}
