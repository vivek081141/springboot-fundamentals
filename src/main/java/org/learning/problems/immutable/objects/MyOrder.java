package org.learning.problems.immutable.objects;

/**
 * Builder pattern is used to create immutable class
 * and the main concept is to create an inner static class
 * which can create the object of main class
 * even if it has a private constructor
 */
public class MyOrder {
  private String mainCourse;
  private String appetisers;
  private String drinks;


  private MyOrder() {
    //stop creating objects
  }

  public String getMainCourse() {
    return mainCourse;
  }

  public String getAppetisers() {
    return appetisers;
  }

  public String getDrinks() {
    return drinks;
  }

  public static class Builder {
    private String mainCourse;
    private String appetisers;
    private String drinks;


    public Builder addAppetiser(String appetisers) {
      this.appetisers = appetisers;
      return this;
    }

    public Builder addDrinks(String drinks) {
      this.drinks = drinks;
      return this;
    }

    public MyOrder build() {
      MyOrder order = new MyOrder();
      order.appetisers = this.appetisers;
      order.drinks = this.drinks;
      order.mainCourse = this.mainCourse;
      return order;
    }
  }
}
