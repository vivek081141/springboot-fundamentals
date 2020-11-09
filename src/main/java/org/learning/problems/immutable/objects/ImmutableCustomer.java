package org.learning.problems.immutable.objects;


/**
 * This is an example of creating immutable Class using Builder Pattern
 * 1. create a private constructor so that it can not be initialized from outside
 * 2. create a static inner class with same parameter
 * 3. on call "build" method of this inner class, an actual object will be created with the given values
 */
public class ImmutableCustomer {

  private String name;
  private String id;

  private ImmutableCustomer() {

  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public static class Builder {

    private String name;
    private String id;

    public Builder() {
    }

    public ImmutableCustomer build() {
      ImmutableCustomer immutableCustomer = new ImmutableCustomer();
      immutableCustomer.name = name;
      immutableCustomer.id = id;
      return immutableCustomer;
    }

    public Builder addId(String id) {
      this.id = id;
      return this;
    }

    public Builder addName(String name) {
      this.name = name;
      return this;
    }
  }
}
