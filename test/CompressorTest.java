package test;

import main.algorithms.Compressor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompressorTest {

    Compressor compressor;

    @Before
    public void setUp(){
        compressor = new Compressor();
    }

    @Test
    public void testCompressor(){
        String string = "aaabb";
        String expectedString = "a3b2";
        Assert.assertEquals(expectedString, compressor.compress(string));
    }
}
