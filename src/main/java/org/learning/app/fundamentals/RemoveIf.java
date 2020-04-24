package org.learning.app.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {


    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");

        list.removeIf( x -> x.equalsIgnoreCase("B"));

        System.out.println(list.size());
    }
}
