/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.java8;

import org.learning.java8.models.Person;
import org.learning.java8.util.ModelMock;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {

  public int getMaxElement() {
    int array[] = {1, 2, 3, 5, 6, 7};
    int max = Arrays.stream(array).reduce(0, (x, y) -> x > y ? x : y);
    return max;
  }

  public int sum() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    return list.stream().reduce(0, (x, y) -> x + y);
  }

  public int sum02() {
    List<String> list = Arrays.asList("1", "2", "5", "6");
    return list.stream().map(x -> Integer.parseInt(x)).reduce(0, (x, y) -> x + y);
  }

  public Person computeMaxSalary() {
    List<Person> list = ModelMock.createPersonList("Test", 10);
    return list.stream().reduce((x, y) -> x.getSalary() > y.getSalary() ? x : y).get();
  }

/*  public Person findAverage() {
    List<Person> list = ModelMock.createPersonList("Test", 10);
    return list.stream().reduce(0, (x, y) -> (x.getSalary() + y.getSalary()) / 2);
  }*/
}
