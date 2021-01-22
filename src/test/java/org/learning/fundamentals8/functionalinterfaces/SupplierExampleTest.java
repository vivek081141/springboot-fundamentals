/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.functionalinterfaces;

import org.junit.Test;
import org.learning.java8.functionalinterfaces.SupplierExample;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExampleTest {

  @Test
  public void test() {
    SupplierExample example = new SupplierExample();
    example.test();
  }

  @Test
  public void supplierWithOptional() {
    Supplier<Double> doubleSupplier = () -> Math.random();
    Optional<Double> optionalDouble = Optional.empty();
    System.out.println(optionalDouble.orElseGet(doubleSupplier));
  }
}