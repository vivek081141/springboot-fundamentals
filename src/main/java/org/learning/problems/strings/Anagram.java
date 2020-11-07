package org.learning.problems.strings;

import java.util.Arrays;

public class Anagram {

  /**
   * Mary, Army, Yarm
   *
   * army, army
   *
   * @param input1
   * @param input2
   */
  public boolean isAnagram(String input1, String input2) {
    if (input1 == null || input2 == null) {
      throw new IllegalArgumentException("Input should not be invalid");
    }

    boolean flag = true;

    if (input1.length() != input2.length()) {
      flag = false;
    }


    char[] input1Chars = input1.toLowerCase().toCharArray();
    char[] input2Chars = input2.toLowerCase().toCharArray();

    Arrays.sort(input1Chars);
    Arrays.sort(input2Chars);

    for (int i =0; i<input1Chars.length; i++ ) {
      if (input1Chars[i] != input2Chars[i]) {
        flag = false;
        break;
      }
    }

    return flag;

  }

}
