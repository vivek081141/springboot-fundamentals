package org.learning.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

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
