import org.junit.Test;

public class SimulationTest
{
    @Test
    public void simulationTest()
    {
        Simulation simulation = new Simulation(2, 1000000);
//        Dice dice = new Dice(6);
//        Bins bins = new Bins(dice);
//
//        bins.storeCountInBin(dice, 1000000);
        simulation.runSimulation();
       // System.out.println(simulation.bin.bins);

    }

}
