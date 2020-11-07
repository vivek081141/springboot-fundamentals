package org.learning.problems.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {


  @Test
  public void test() throws IllegalAccessException {
    Palindrome palindrome = new Palindrome();
    Assert.assertEquals(true, palindrome.checkPalindrome("abcba"));
    Assert.assertEquals(false, palindrome.checkPalindrome("queue"));
    Assert.assertEquals(true, palindrome.checkPalindrome("leveL"));

    Assert.assertEquals(true, palindrome.integerPalindrome(12321));
  }

}