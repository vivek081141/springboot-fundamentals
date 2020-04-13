package org.learning.design.patterns.creational.abstractfactory;

import org.learning.design.patterns.creational.abstractfactory.nonveg.NonVegPizzaFactory;
import org.learning.design.patterns.creational.abstractfactory.veg.VegPizzaFactory;

public class PizzaFactoryProvider {

    public static AbstractPizzaFactory getPizzaFactory(String type){
        if("VEG".equals(type)){
            return new VegPizzaFactory();
        }
        if(("NONVEG").equals(type)){
            return new NonVegPizzaFactory();
        }
        return null;
    }
}
