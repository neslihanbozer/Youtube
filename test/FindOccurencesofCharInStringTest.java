package test;

import main.algorithms.FindOccurencesofCharInString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindOccurencesofCharInStringTest {

    FindOccurencesofCharInString findOccurencesofCharInString;

    @Before
    public void setUp(){
        findOccurencesofCharInString = new FindOccurencesofCharInString();
    }

    @Test
    public void testOccurencesInString(){

        Assert.assertEquals(2, findOccurencesofCharInString.methodForLoop("neslly", 'l'));

        Assert.assertEquals(2, findOccurencesofCharInString.methodRecursion("neslly", 'l'));

        Assert.assertEquals(2, findOccurencesofCharInString.methodRegex("neslly", "l"));

        Assert.assertEquals(2, findOccurencesofCharInString.methodStreamAPI1("neslly", 'l'));

        Assert.assertEquals(2, findOccurencesofCharInString.methodStreamAPI2("neslly", 'l'));

    }
}

