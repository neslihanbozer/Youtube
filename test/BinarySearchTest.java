package test;

import main.algorithms.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    BinarySearch binarySearch;
    int[] searchArray;

    @Before
    public void setUp(){
        binarySearch = new BinarySearch();
        searchArray = new int[] {2, 3, 5, 6, 9, 11, 12, 15, 17, 21};
    }

    @Test
    public void testBinarySearchRecursive(){

        Assert.assertEquals(2, binarySearch.binarySearchRecursion(searchArray, 5));
        Assert.assertEquals(0, binarySearch.binarySearchRecursion(searchArray, 2));
        Assert.assertEquals(5, binarySearch.binarySearchRecursion(searchArray, 11));
        Assert.assertEquals(8, binarySearch.binarySearchRecursion(searchArray, 17));

        Assert.assertEquals(-1, binarySearch.binarySearchRecursion(searchArray, 22));
    }


    @Test
    public void testBinarySearchIterative(){

        Assert.assertEquals(2, binarySearch.binarySearchIteration(searchArray, 5));
        Assert.assertEquals(0, binarySearch.binarySearchIteration(searchArray, 2));
        Assert.assertEquals(5, binarySearch.binarySearchIteration(searchArray, 11));
        Assert.assertEquals(8, binarySearch.binarySearchIteration(searchArray, 17));

        Assert.assertEquals(-1, binarySearch.binarySearchIteration(searchArray, 22));
    }
}
