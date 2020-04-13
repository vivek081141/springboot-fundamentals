package org.learning.design.patterns.creational.abstractfactory.veg;

import org.learning.design.patterns.creational.abstractfactory.AbstractPizzaFactory;
import org.learning.design.patterns.creational.abstractfactory.Pizza;

public class VegPizzaFactory extends AbstractPizzaFactory {

    public Pizza create(String type){
        if(type.equals("CHESSE")){
            return new CheesePizza();
        }
        if(type.equals("MUSHROOM")){
            return new MushroomPizza();
        }
        return null;
    }
}
