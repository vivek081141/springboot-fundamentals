/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.abstractfactory.veg;

import org.learning.designpattern.creational.abstractfactory.Pizza;

public class CheesePizza implements Pizza {

    @Override
    public String getName() {
        return "Cheese Pizza";
    }
}
