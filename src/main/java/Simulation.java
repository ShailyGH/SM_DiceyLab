

public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    private Dice dice;
    private Bins bins;

    public Simulation() {
    }

    public Simulation(Integer numberOfDice, Integer numberOfTosses)
    {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(dice);
    }
public void runSimulation()
    {
        int tossValue = 0;
        for (int i = 0; i < numberOfTosses; i++)
        {
            tossValue = this.dice.diceRoll();
            this.bins.incrementBin(tossValue);
        }
    }

}
