/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory.nonveg;

import org.learning.designpattern.creational.abstractfactory.AbstractPizzaFactory;
import org.learning.designpattern.creational.abstractfactory.Pizza;

public class NonVegPizzaFactory extends AbstractPizzaFactory {

    public Pizza create(String type){
        if(type.equals("CHICKEN")){
            return new ChickenPizza();
        }
        return null;
    }
}
