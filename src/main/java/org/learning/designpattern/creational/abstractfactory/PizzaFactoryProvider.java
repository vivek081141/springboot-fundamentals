/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory;

import org.learning.designpattern.creational.abstractfactory.nonveg.NonVegPizzaFactory;
import org.learning.designpattern.creational.abstractfactory.veg.VegPizzaFactory;

public class PizzaFactoryProvider {

  public static AbstractPizzaFactory getPizzaFactory(String type) {
    if ("VEG".equals(type)) {
      return new VegPizzaFactory();
    }
    if (("NONVEG").equals(type)) {
      return new NonVegPizzaFactory();
    }
    return null;
  }
}
