package org.learning.design.patterns.creational.prototype;


import org.junit.Assert;
import org.junit.Test;

/**
 * Prototype pattern is all about creating a new instance of object from the old copy
 * if its a costly operation to create a brand new object every time.
 * Not a very useful pattern in my opinion.
 * It can either use three following ways
 * 1. new Object(this) to create a new object by passing the parameter in the constructor
 * 2. Shallow Copy - should not be used as it doesn't create new instance
 * 3. Deep Copy - using serialization and deserialization
 *
 */
public class PrototypeDemoTest {

    @Test
    public void test(){

        Rectangle rectangle = new Rectangle();
        rectangle.setX(2);
        rectangle.setY(5);
        Assert.assertEquals(10,rectangle.getArea().doubleValue(),0);

        Rectangle newRectangle = rectangle.clone();
        newRectangle.setX(10);
        Assert.assertEquals(50,newRectangle.getArea().doubleValue(),0);

    }
}
