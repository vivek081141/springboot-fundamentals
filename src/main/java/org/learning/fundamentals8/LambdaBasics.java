/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8;

import org.learning.fundamentals8.models.Person;
import org.learning.fundamentals8.models.PersonComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaBasics {

  /**
   * List should be sorted
   **/
  public void comparator01(List<Person> list) {
    Collections.sort(list, new PersonComparator());
  }

  public void comparator02(List<Person> list) {
    Collections.sort(list, new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return (int) (p1.getSalary() - p2.getSalary());
      }
    });
  }

  public void comparator03(List<Person> list) {
    Comparator<Person> salaryComparator = (p1, p2) -> (int) (p1.getSalary() - p2.getSalary());
    Collections.sort(list, salaryComparator);
  }

  public void comparator003(List<Person> list) {
    Collections.sort(list, (p1, p2) -> salaryComparator(p1, p2));
  }

  public int salaryComparator(Person p1, Person p2) {
    return (int) (p1.getSalary() - p2.getSalary());
  }


  public void comparator04(List<Person> list) {
    Comparator<Person> nameComparator = Comparator.comparing(Person::getSalary);
    Collections.sort(list, nameComparator);
  }

  @FunctionalInterface
  interface ISayable {
    void say();
  }

  class Sayable implements ISayable {

    @Override
    public void say() {
      comparator04(new ArrayList<>());
    }
  }

  public void comparator05() {
    ISayable sayable = LambdaBasics::saySomething;
    sayable.say();
  }

  public void comparator06() {
    ISayable sayable = () -> saySomething();
    sayable.say();
  }

  public void comparator07() {
    ISayable sayable = () -> comparator04(new ArrayList<>());
    sayable.say();
  }

  public static void saySomething() {
    System.out.println("Hello, this is static method.");
  }
}
