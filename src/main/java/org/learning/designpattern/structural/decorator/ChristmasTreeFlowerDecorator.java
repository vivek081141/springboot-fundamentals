/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.decorator;

/**
 * Demo present in ChristmasTreeDecoratorTest
 **/
public class ChristmasTreeFlowerDecorator extends ChristmasTreeDecorator {

  public ChristmasTreeFlowerDecorator(IChristmasTree christmasTree) {
    super(christmasTree);
  }

  @Override
  public String decorateTree() {
    return christmasTree.decorateTree() + " Adding Flowers and garlands";
  }
}
