package test;

import main.algorithms.Palindrome;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    public void testPalindromeFunctionOne(){
        Assert.assertTrue(palindrome.isPalindrome_f1("abba"));
        Assert.assertTrue(palindrome.isPalindrome_f1("aba"));
        Assert.assertFalse(palindrome.isPalindrome_f1("ab"));
        Assert.assertTrue(palindrome.isPalindrome_f1("a"));
        Assert.assertTrue(palindrome.isPalindrome_f1(""));
    }

    @Test
    public void testPalindromeFunctionTwo(){
        Assert.assertTrue(palindrome.isPalindrome_f2("abba"));
        Assert.assertTrue(palindrome.isPalindrome_f2("aba"));
        Assert.assertFalse(palindrome.isPalindrome_f2("ab"));
        Assert.assertTrue(palindrome.isPalindrome_f2("a"));
        Assert.assertTrue(palindrome.isPalindrome_f2(""));
    }
}
