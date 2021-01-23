package test;

import main.algorithms.IntegerReverse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerReverseTest {

    IntegerReverse integerReverse;

    @Before
    public void setUp(){
        integerReverse = new IntegerReverse();
    }

    @Test
    public void testIntegerReverse(){
        Assert.assertEquals(321, integerReverse.reverseByString(123));
        Assert.assertEquals(-321, integerReverse.reverseByString(-123));

        Assert.assertEquals(321, integerReverse.reverseInteger(123));
        Assert.assertEquals(-321, integerReverse.reverseInteger(-123));
    }
}
