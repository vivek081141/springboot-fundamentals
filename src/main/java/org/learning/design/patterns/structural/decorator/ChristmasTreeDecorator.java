package org.learning.design.patterns.structural.decorator;

public class ChristmasTreeDecorator implements IChristmasTree{

    protected IChristmasTree christmasTree;

    public ChristmasTreeDecorator(IChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorateTree() {
        return christmasTree.decorateTree() + "Adding the light bulbs.";
    }
}
