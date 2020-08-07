/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory.nonveg;

import org.learning.designpattern.creational.abstractfactory.Pizza;

public class ChickenPizza implements Pizza {

  @Override
  public String getName() {
    return "Chicken Pizza";
  }
}
