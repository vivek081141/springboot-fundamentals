package org.learning.design.patterns.structural.composite;

public class LeafComponent implements IMenuComponent {
    private String text;

    public LeafComponent(String text){
        this.text = text;
    }

    @Override
    public String getHtml() {
        return "<li>"+text+"</li>";
    }
}
