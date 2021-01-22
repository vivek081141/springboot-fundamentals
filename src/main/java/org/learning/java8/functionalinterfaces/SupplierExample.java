/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.java8.functionalinterfaces;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class SupplierExample {


  //Accepts nothing, returns T
  public void test() {
    Supplier supplier = () -> "Hello World";
    System.out.println(supplier.get());

    BooleanSupplier booleanSupplier = () -> true;
    booleanSupplier.getAsBoolean();

    Supplier<Boolean> supplier1 = () -> true;

    System.out.println(supplier1.get());
  }
}
