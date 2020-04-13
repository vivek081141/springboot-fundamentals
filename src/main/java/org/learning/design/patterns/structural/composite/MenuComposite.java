package org.learning.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  Composite has zero to many Component
 *
 */
public class MenuComposite implements IMenuComponent {
    private String name;
    private String title;

    private List<IMenuComponent> arrayList =  null;

    public MenuComposite(String title, List<IMenuComponent> arrayList) {
        this.title = title;
        this.arrayList = arrayList;
    }


    @Override
    public String toString() {
        String s = "Menu{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
        StringBuilder sb = new StringBuilder(s);

        Iterator<IMenuComponent> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            IMenuComponent menu = iterator.next();
            sb.append(menu.toString());
        }
        return sb.toString();
    }

    @Override
    public String getHtml() {
        return null;
    }
}
