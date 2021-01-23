package test;

import main.algorithms.AbsoluteValue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbsoluteValueTest {

    AbsoluteValue absoluteValue;
    int[] array = {0, -2, -2, -7, 2};
    int[] expected = {0, -2, -2, 2, -7};

    @Before
    public void setUp(){
        absoluteValue = new AbsoluteValue();
    }

    @Test
    public void testAbsoluteValueOrder(){
        Assert.assertArrayEquals(expected, absoluteValue.absSort(array));
    }

}
