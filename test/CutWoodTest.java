package test;

import main.algorithms.CutWood;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CutWoodTest {

    CutWood cutWood;

    @Before
    public void setUp(){
        cutWood = new CutWood();
    }

    @Test
    public void testCutWood(){

        int[] array1 = {5,9,7};
        int k1 = 3;
        Assert.assertEquals(5, cutWood.cutWood(array1,k1));

        int[] array2 = {5,9,7};
        int k2 = 4;
        Assert.assertEquals(4, cutWood.cutWood(array2,k2));

        int[] array3 = {1,2,3};
        Arrays.sort(array3);
        int k3 = 7;
        Assert.assertEquals(0, cutWood.cutWood(array3, k3));
    }
}
