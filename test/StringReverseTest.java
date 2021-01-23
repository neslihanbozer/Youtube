package test;

import main.algorithms.StringReverse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

    StringReverse stringReverse;

    @Before
    public void setUp(){
        stringReverse = new StringReverse();
    }

    @Test
    public void testReverseString(){
        Assert.assertEquals("nahilseN", stringReverse.stringReverseAPI("Neslihan"));
        Assert.assertEquals("maS", stringReverse.stringReverseAPI("Sam"));
        Assert.assertEquals("nhoJ", stringReverse.stringReverse("John"));
        Assert.assertEquals("nodnoL ot tnew I", stringReverse.stringReverse("I went to London"));
    }
}
