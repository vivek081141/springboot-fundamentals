/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.decorator;

public class ChristmasTreeDecorator implements IChristmasTree {

  protected IChristmasTree christmasTree;

  public ChristmasTreeDecorator(IChristmasTree christmasTree) {
    this.christmasTree = christmasTree;
  }

  @Override
  public String decorateTree() {
    return christmasTree.decorateTree() + "Adding the light bulbs.";
  }
}
