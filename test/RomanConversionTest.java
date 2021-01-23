package test;

import main.algorithms.RomanConversion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanConversionTest {

    RomanConversion romanConversion;

    @Before
    public void setUp(){
        romanConversion = new RomanConversion();
    }

    @Test
    public void testRomanConversion(){
        Assert.assertEquals(154, romanConversion.parseToInt("CLIV"));
        Assert.assertEquals(101, romanConversion.parseToInt("CI"));
        Assert.assertEquals(43, romanConversion.parseToInt("XLIII"));
        Assert.assertEquals(1, romanConversion.parseToInt("I"));
        Assert.assertEquals(5, romanConversion.parseToInt("V"));
        Assert.assertEquals(33, romanConversion.parseToInt("XXXIII"));
        Assert.assertEquals(747, romanConversion.parseToInt("DCCXLVII"));
        Assert.assertEquals(929, romanConversion.parseToInt("CMXXIX"));
        Assert.assertEquals(1232, romanConversion.parseToInt("MCCXXXII"));
        Assert.assertEquals(1013, romanConversion.parseToInt("MXIII"));
        Assert.assertEquals(3999, romanConversion.parseToInt("MMMCMXCIX"));
        Assert.assertEquals(145, romanConversion.parseToInt("CXLV"));

        Assert.assertEquals(-1, romanConversion.parseToInt("null"));
        Assert.assertEquals(-1, romanConversion.parseToInt(""));
        Assert.assertEquals(-1, romanConversion.parseToInt("KMXI"));
        Assert.assertEquals(-1, romanConversion.parseToInt("VX"));
        Assert.assertEquals(-1, romanConversion.parseToInt("VL"));
        Assert.assertEquals(-1, romanConversion.parseToInt("VC"));
        Assert.assertEquals(-1, romanConversion.parseToInt("VD"));
        Assert.assertEquals(-1, romanConversion.parseToInt("VM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("LC"));
        Assert.assertEquals(-1, romanConversion.parseToInt("LD"));
        Assert.assertEquals(-1, romanConversion.parseToInt("LM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("DM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("IL"));
        Assert.assertEquals(-1, romanConversion.parseToInt("IC"));
        Assert.assertEquals(-1, romanConversion.parseToInt("ID"));
        Assert.assertEquals(-1, romanConversion.parseToInt("IM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("XD"));
        Assert.assertEquals(-1, romanConversion.parseToInt("XM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("MIXI"));
        Assert.assertEquals(-1, romanConversion.parseToInt("IXI"));
        // MMMM is not valid because in roman numbers there are only three same letters in a row allowed.
        Assert.assertEquals(-1, romanConversion.parseToInt("MMMM"));
        Assert.assertEquals(-1, romanConversion.parseToInt("IIII"));

    }
}
