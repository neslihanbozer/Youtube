package test;

import main.algorithms.MergeTwoSortedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListTest {

    MergeTwoSortedList mergeTwoSortedList;

    @Before
    public void setUp(){
        mergeTwoSortedList = new MergeTwoSortedList();
    }

    @Test
    public void testMergedList(){
        int[] L1 = {2,8,11,14};
        int[] L2 = {1,3,5,7};

        int[] L3 = {1,2,3,5,7,8,11,14};

        Assert.assertArrayEquals(L3, mergeTwoSortedList.mergeTwoSortedList(L1,L2));
    }
}
