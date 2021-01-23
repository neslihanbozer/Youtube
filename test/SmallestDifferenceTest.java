package test;

import main.algorithms.SmallestDifference;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmallestDifferenceTest {

    SmallestDifference smallestDifference;

    @Before
    public void setUp(){
        smallestDifference = new SmallestDifference();
    }

    @Test
    public void testSmallestDifference(){
        int[] array1 = {11,4,15,11,32};
        int[] array2 = {25,600,300,19,2};
        Assert.assertEquals(2, smallestDifference.findDifferenceBruteForce(array1, array2));
        Assert.assertEquals(2, smallestDifference.findDifferenceOptimal(array1, array2));
    }
}
