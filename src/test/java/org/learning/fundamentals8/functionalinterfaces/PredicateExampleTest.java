/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.functionalinterfaces;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateExampleTest {

  @Test
  public void testCase1 () {
    PredicateExample predicateExample = new PredicateExample();
    List<String> list = Arrays.asList("A", "B", "C", "D");
    List<String> list01 = predicateExample.removeElement(list, "B");
    Assertions.assertEquals(2, list01.size());
    list.spliterator().forEachRemaining( x -> System.out.println(x));
  }

  @Test
  public void test() {
    PredicateExample example = new PredicateExample();
    Assertions.assertEquals( true, example.test(15)  );
  }
}
