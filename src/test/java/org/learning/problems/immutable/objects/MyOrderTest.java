package org.learning.problems.immutable.objects;

import org.junit.Assert;
import org.junit.Test;

public class MyOrderTest {

  @Test
  public void test() {
    MyOrder order = new MyOrder.Builder().addAppetiser("baby Corn").addDrinks("Soda").build();
    Assert.assertEquals("baby Corn", order.getAppetisers());
  }
}