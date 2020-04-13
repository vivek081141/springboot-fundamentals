package org.learning.design.patterns.creational.abstractfactory.nonveg;

import org.learning.design.patterns.creational.abstractfactory.Pizza;

public class ChickenPizza implements Pizza {

    @Override
    public String getName() {
        return "Chicken Pizza";
    }
}
