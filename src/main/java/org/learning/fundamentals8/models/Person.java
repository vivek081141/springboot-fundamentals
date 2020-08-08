/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
  private String name;
  private float salary;

  public Person() {
  }

  public Person(String name, float salary) {
    this.name = name;
    this.salary = salary;
  }

}
