package org.learning.problems.strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

  @Test
  public void test() {
    Anagram anagram = new Anagram();
    Assert.assertEquals(true, anagram.isAnagram("army", "mary"));
  }
}
