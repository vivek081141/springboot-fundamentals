/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/** Demo at FlyweightPatternDemo **/
public class ShapeFactory {

    private static Map<String,Shape> hashMap = new HashMap();

    public static Shape getCircle(String color){
        if(hashMap.get(color)==null){
            Shape shape = new Circle(color);
            hashMap.put(color,shape);
        }
        return hashMap.get(color);
    }
}
