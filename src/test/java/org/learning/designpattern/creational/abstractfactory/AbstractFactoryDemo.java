/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory;

import org.junit.Test;


/**
 * Abstract Factory is simply referred to Factory of Factory
 * 1. Factory Provider is unnecessary as a static method can be defined in the AbstractFactory too
 * 2. Both the factories are returning objects of same type i.e Pizza in my case, they should be able to return different kinds of object
 * otherwise, instead of creating factory of factory, its better to create one large factory.
 * 3. The example provided at https://www.javatpoint.com/abstract-factory-pattern, the factory creates different kinds of objects.
 *
 * 4. Examples: Credit Card - Different Types as Visa, Master, Amex and each can have different categories
 * Bank - Different banks and each bank can have different loan options
 *
 */
public class AbstractFactoryDemo {

    @Test
    public void test(){
        AbstractPizzaFactory nonVegPizzaFactory = PizzaFactoryProvider.getPizzaFactory("NONVEG");
        Pizza chickenPizza = nonVegPizzaFactory.create("CHICKEN");
        System.out.println(chickenPizza.getName());

        AbstractPizzaFactory vegPizzaFactory = PizzaFactoryProvider.getPizzaFactory("VEG");
        Pizza mushroomPizza = vegPizzaFactory.create("MUSHROOM");
        System.out.println(mushroomPizza.getName());

    }
}
