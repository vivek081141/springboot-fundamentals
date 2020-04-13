package org.learning.design.patterns.creational.abstractfactory;

public abstract class AbstractPizzaFactory {

    public abstract Pizza create(String type);


   /* public static AbstractPizzaFactory getPizzaFactory(String type){
        if("VEG".equals(type)){
            return new VegPizzaFactory();
        }
        if(("NONVEG").equals(type)){
            return new NonVegPizzaFactory();
        }
        return null;
    }

    public getPizza();*/
}
