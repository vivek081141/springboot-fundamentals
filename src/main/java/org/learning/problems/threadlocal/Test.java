package org.learning.problems.threadlocal;

public class Test {

  private ThreadLocal<String> name = new ThreadLocal<>();

  public String getName() {
    return name.get();
  }

  public void setName(String name) {
    this.name.set(name);
  }
}
