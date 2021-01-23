package test;

import main.algorithms.MinHeap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinHeapTest {

    MinHeap minHeap;

    @Before
    public void setUp(){
        minHeap = new MinHeap();
    }

    @Test
    public void testMinHeap(){
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(7);
        minHeap.add(8);
        Assert.assertEquals(2, minHeap.peek());

        minHeap.poll();
        Assert.assertEquals(3,minHeap.peek());
    }
}
