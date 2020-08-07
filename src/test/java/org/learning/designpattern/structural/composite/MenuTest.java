/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.composite;

import org.junit.Test;

/**
 * Composite pattern without using any abstract class or interface
 **/

/** I was asked during an interview to design code that compute the price of boxes containing items.
 * Assuming that each item inside the box has a price, and that the box itself has a price.
 *
 * <ul><li>Beverage</li><ul><li>Coffee</li><li>Tea</li><li>Milk</li></ul></ul>
 *
 * **/

public class MenuTest {

  @Test
  public void test() {
    MenuComposite m1 = new MenuComposite("Beverage");
    LeafComponent m2 = new LeafComponent("Coffee");
    LeafComponent m3 = new LeafComponent("Tea");
    LeafComponent m4 = new LeafComponent("Milk");
    m1.addList(m2);
    m1.addList(m3);
    m1.addList(m4);
    System.out.println(m1.getHtml());
  }

}