package org.learning.problems.strings;

public class Palindrome {


  /**
   * check palindrome for strings
   */
  public boolean checkPalindrome(String input) throws IllegalAccessException {
    if (input == null || input.isEmpty()) {
      throw new IllegalAccessException("Input is incorrect");
    }

    char[] chars = input.toLowerCase().toCharArray();
    int length = chars.length - 1;
    boolean flag = true;

    for (int i = 0, l = length; i < (chars.length + 1) / 2; i++, l--) {
      if (chars[i] != chars[l]) {
        flag = false;
        break;
      }
    }

    return flag;
  }

  /**
   * check palindrome for numbers
   * eg: 12321
   * 123
   * 458965 =>
   */
  public boolean integerPalindrome(Integer input) throws IllegalAccessException {
    int originalInput = input;
    int number = 0;
    while (input != 0) {
      int remainder = input % 10;
      number = number * 10 + remainder;
      input = input / 10;
    }
    if (number == originalInput) {
      return true;
    }
    return false;
  }
}
