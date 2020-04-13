package org.learning.design.patterns.structural.decorator;

public class ChristmasTreeFlowerDecorator extends ChristmasTreeDecorator {

    public ChristmasTreeFlowerDecorator(IChristmasTree christmasTree){
       super(christmasTree);
    }

    @Override
    public String decorateTree() {
        return christmasTree.decorateTree() + " Adding Flowers and garlands";
    }
}
