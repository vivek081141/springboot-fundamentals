package org.learning.design.patterns.creational.abstractfactory.veg;

import org.learning.design.patterns.creational.abstractfactory.Pizza;

public class CheesePizza implements Pizza {

    @Override
    public String getName() {
        return "Cheese Pizza";
    }
}
