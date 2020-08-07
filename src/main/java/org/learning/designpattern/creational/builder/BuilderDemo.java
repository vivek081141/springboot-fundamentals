/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.builder;

/**
 * The implementation is provided in BuilderDemoTest
 **/
public class BuilderDemo {
  private String name;
  private String id;

  private BuilderDemo(Builder builder) {
    this.name = builder.name;
    this.id = builder.id;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  static class Builder {
    private String name;
    private String id;

    public Builder addName(String name) {
      this.name = name;
      return this;
    }

    public Builder addId(String id) {
      this.id = id;
      return this;
    }

    public BuilderDemo build() {
      return new BuilderDemo(this);
    }
  }

}
