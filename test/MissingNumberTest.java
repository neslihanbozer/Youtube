package test;

import main.algorithms.MissingNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MissingNumberTest {

    MissingNumber missingNumber;

    @Before
    public void setUp(){
        missingNumber = new MissingNumber();
    }

    @Test
    public void testMissingNumber(){
        int array1[] = {1,2,4,6,3,7,8};
        int expected1 = 5;
        Assert.assertEquals(expected1, missingNumber.findMissingNumber(array1));

        int array2[] = {1,2,3,4,5};
        int expected2 = 6;
        Assert.assertEquals(expected2, missingNumber.findMissingNumber(array2));

    }
}
