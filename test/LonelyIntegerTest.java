package test;

import main.algorithms.LonelyInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LonelyIntegerTest {

    LonelyInteger lonelyInteger;

    @Before
    public void setUp(){
        lonelyInteger = new LonelyInteger();
    }

    @Test
    public void testLonelyInteger(){

        int[] array = {1, 2, 3, 4, 5, 1, 2, 4, 5};
        int expectedNum = 3;
        Assert.assertEquals(expectedNum, lonelyInteger.findLonelyInteger(array));
    }
}
