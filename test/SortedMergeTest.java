package test;

import main.algorithms.SortedMerge;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedMergeTest {

    SortedMerge sortedMerge;

    @Before
    public void setUp(){
        sortedMerge = new SortedMerge();
    }

    @Test
    public void testMergedList(){

        int[] a={3,4,6,7,9,10,0,0,0,0};
        int[] b={1,2,5,11};

        int[] c={1,2,3,4,5,6,7,9,10,11};

        Assert.assertArrayEquals(c,sortedMerge.merge(a,b));
    }
}
