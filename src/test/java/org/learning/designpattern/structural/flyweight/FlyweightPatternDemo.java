/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.flyweight;

import org.junit.Test;

import java.io.IOException;

/**
 * Flyweight Example taken from tutorial point
 * What if we change the state, the map stored in Flywieght Pattern would start giving changed values
 * I think it should return immutable objects
 * something to do with intrinsic vs extrinsic
 * Overall NO LEARNING
 */
public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void test() throws IOException {
        for(int i=0; i < 20; ++i) {
            //I would like all my objects to be immutable
            Circle circle = (Circle)ShapeFactory.getCircle(colors[0]);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();

        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}