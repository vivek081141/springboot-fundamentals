package org.learning.design.patterns.structural.adapter;

public class Adapter implements IAdapter {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void newRequest(){
        adaptee.request();
    }
}
