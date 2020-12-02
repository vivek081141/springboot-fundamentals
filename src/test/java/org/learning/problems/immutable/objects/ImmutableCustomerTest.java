package org.learning.problems.immutable.objects;

import org.junit.Assert;
import org.junit.Test;

public class ImmutableCustomerTest {

  @Test
  public void test() {
    ImmutableCustomer customer = new ImmutableCustomer.Builder().addId("12345").addName("Vivek").build();
    Assert.assertEquals("12345", customer.getId());
  }

  @Test
  public void test2() {
    ImmutablePerson customer = new ImmutablePerson.Builder().addName("12345").build();
    Assert.assertEquals("12345", customer.getName());
  }
}