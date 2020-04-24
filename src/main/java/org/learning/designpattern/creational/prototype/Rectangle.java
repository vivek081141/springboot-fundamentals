/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.prototype;

public class Rectangle implements Shape,Cloneable {
    private int x;
    private int y;

    public Rectangle(){
    }


    public Rectangle(Rectangle rectangle) {
        this.x = rectangle.x;
        this.y = rectangle.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(this);
    }

    @Override
    public Double getArea() {
        return Double.valueOf(x*y);
    }
}
