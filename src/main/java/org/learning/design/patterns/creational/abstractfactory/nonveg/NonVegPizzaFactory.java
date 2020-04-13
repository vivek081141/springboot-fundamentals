package org.learning.design.patterns.creational.abstractfactory.nonveg;

import org.learning.design.patterns.creational.abstractfactory.AbstractPizzaFactory;
import org.learning.design.patterns.creational.abstractfactory.Pizza;

public class NonVegPizzaFactory extends AbstractPizzaFactory {

    public Pizza create(String type){
        if(type.equals("CHICKEN")){
            return new ChickenPizza();
        }
        return null;
    }
}
