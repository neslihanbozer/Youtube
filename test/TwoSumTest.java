package test;

import main.algorithms.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    TwoSum twoSum;
    int[] array = {2, 13, 9, 15};
    int sum = 11;
    int[] result = {0, 2};

    @Before
    public void setUp(){
        twoSum = new TwoSum();
    }

    @Test
    public void testFunctionOne(){
        Assert.assertArrayEquals(result, twoSum.testTwoSumOne(array, sum));
    }

    @Test
    public void testFunctionTwo(){
        Assert.assertArrayEquals(result, twoSum.testTwoSumTwo(array, sum));
    }

    @Test
    public void testFunctionThree(){
        int[] orderedArray = {2, 9,13, 15};
        int sum = 11;
        int[] result = {0, 1};
        Assert.assertArrayEquals(result, twoSum.testTwoSumThree(array, sum));
    }
}
