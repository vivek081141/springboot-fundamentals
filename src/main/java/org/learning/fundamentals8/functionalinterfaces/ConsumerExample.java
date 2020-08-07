/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.functionalinterfaces;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerExample {

  /**
   * Input T, Output Nothing
   **/

  public void test() {
    Consumer<String> consumer = x -> System.out.println(x);
    Stream<String> cities = Stream.of("Bangalore", "Mumbai", "Delhi", "Chennai");
    cities.forEach(consumer);
  }


  /**
   * all the foreach loop overrides consumer accept function
   **/
  public void enhancedTest() {
    Stream<String> cities = Stream.of("Bangalore", "Mumbai", "Delhi", "Chennai");
    cities.forEach(x -> System.out.println());
  }

  public void test02() {
    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    Stream<String> cities = Stream.of("Bangalore", "Mumbai", "Delhi", "Chennai");
    cities.forEach(consumer);
  }
}
