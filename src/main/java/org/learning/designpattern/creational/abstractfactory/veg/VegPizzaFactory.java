/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory.veg;

import org.learning.designpattern.creational.abstractfactory.AbstractPizzaFactory;
import org.learning.designpattern.creational.abstractfactory.Pizza;

public class VegPizzaFactory extends AbstractPizzaFactory {

  public Pizza create(String type) {
    if (type.equals("CHESSE")) {
      return new CheesePizza();
    }
    if (type.equals("MUSHROOM")) {
      return new MushroomPizza();
    }
    return null;
  }
}
