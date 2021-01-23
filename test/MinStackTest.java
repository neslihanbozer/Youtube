package test;

import main.algorithms.MinStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinStackTest {

    MinStack minStack;

    @Before
    public void setUp(){
        minStack = new MinStack();
    }

    @Test
    public void testMinStack(){

        minStack.push(5);
        minStack.push(2);
        minStack.push(9);
        minStack.push(8);
        minStack.push(1);

        Assert.assertEquals(1, minStack.getMin());

        minStack.pop();
        Assert.assertEquals(2, minStack.getMin());

    }
}
