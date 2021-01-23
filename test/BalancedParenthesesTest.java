package test;

import main.algorithms.BalancedParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalancedParenthesesTest {

    BalancedParentheses balancedParentheses;

    @Before
    public void setUp(){
        balancedParentheses = new BalancedParentheses();
    }

    @Test
    public void testBalancedParantheses(){
        Assert.assertTrue(balancedParentheses.findBrackets("{[()]}"));
        Assert.assertFalse(balancedParentheses.findBrackets("{[()}"));
        Assert.assertFalse(balancedParentheses.findBrackets("{[(]}"));
    }

}
