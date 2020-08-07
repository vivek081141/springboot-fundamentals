/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory;

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
