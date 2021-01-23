package test;

import main.algorithms.PancakeSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PancakeSortTest {

    PancakeSort pancakeSort;
    int[] array = {1, 5, 4, 3, 2};
    int[] expectedArray = {1, 2, 3, 4, 5};

    @Before
    public void setUp(){
        pancakeSort = new PancakeSort();
    }

    @Test
    public void testPancakeSort(){
        Assert.assertArrayEquals(expectedArray, pancakeSort.sort(array));
    }
}
