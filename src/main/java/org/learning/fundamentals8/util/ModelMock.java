/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.util;

import org.learning.fundamentals8.models.Person;
import java.util.ArrayList;
import java.util.List;

public class ModelMock {

  public static List<Person> getPersonList(String prefix, int iteration) {
    return createPersonList(prefix, iteration);
  }

  public static List<Person> createPersonList(String prefix, int iteration) {
    List<Person> personList = new ArrayList<>();
    for (int i = 0; i < iteration; i++) {
      Person person = new Person(prefix + i, 1000 * i);
      personList.add(person);
    }
    return personList;
  }
}
