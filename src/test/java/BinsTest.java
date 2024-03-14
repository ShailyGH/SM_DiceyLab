import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class BinsTest {
    @Test
    public void createStorageBinTest()
    {
        Dice dice = new Dice(4);
        Bins bins = new Bins(dice);

        bins.createStorageBin();
        int actual = bins.countTotals.lastKey();
        int expected = 24;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void storeCountInBinTest()
    {
        Dice dice = new Dice(3);
        Bins bins = new Bins(dice);
        bins.storeCountInBin(dice, 48);
        int actual = 0;
        for (int i = 3; i < 18; i++)
        {
            actual += bins.countTotals.get(i);
        }
        int expected = 48;

        Assert.assertEquals(expected, actual);
    }
}
