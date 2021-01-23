package test;

import main.algorithms.QueueByStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class QueueByStackTest {

    QueueByStack queueByStack;

    @Before
    public void setUp(){
        queueByStack = new QueueByStack<>();
    }

    @Test
    public void testQueueByStack(){
        queueByStack.enqueue("zeta");
        queueByStack.enqueue("alpha");
        queueByStack.enqueue("beta");
        queueByStack.enqueue("gamma");

        Assert.assertEquals(Optional.of("zeta"), queueByStack.dequeue());
        Assert.assertEquals(Optional.of("alpha"), queueByStack.dequeue());
        Assert.assertEquals(Optional.of("beta"), queueByStack.dequeue());
        Assert.assertEquals(Optional.of("gamma"), queueByStack.dequeue());
        Assert.assertEquals(Optional.empty(), queueByStack.dequeue());

    }

}
