package org.learning.problems.immutable.objects;

public class ImmutablePerson {
  private String name;
  private String id;

  private ImmutablePerson() {
    //no object can be created
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

    public Builder addName(String name) {
      this.name = name;
      return this;
    }

    public ImmutablePerson build() {
      ImmutablePerson person = new ImmutablePerson();
      person.id = this.id;
      person.name = this.name;
      return  person;
    }

  }
}


