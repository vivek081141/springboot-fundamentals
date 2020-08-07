/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.models;

public class Person {
  private String name;
  private float salary;

  public Person() {
  }

  public Person(String name, float salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", salary=" + salary + '}';
  }
}
