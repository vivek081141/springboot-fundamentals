/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.java8.functionalinterfaces;

import org.learning.java8.models.Person;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BiFunctionExample {

  public void mapTest() {
    Map<Integer, List<Person>> map1 = Map.of(12, Arrays.asList(new Person("Vivek", 2000)), 13, Arrays.asList(new Person("MkYong", 3000)));

    map1.forEach((key, personList) -> {
      personList.forEach((person) -> System.out.println(key + "-->" + person.toString()));
    });


  }
}
