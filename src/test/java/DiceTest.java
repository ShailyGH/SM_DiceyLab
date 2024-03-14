import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
    @Test
    public void diceRoll()
    {

        Dice dice = new Dice(5);

        Boolean actual = (5 <= dice.diceRoll() && dice.diceRoll() <= 30);
        Boolean expected = (5 <= dice.diceRoll() && dice.diceRoll() <= 30);

        Assert.assertEquals(expected, actual);
    }
}
