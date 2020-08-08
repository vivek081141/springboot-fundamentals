/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReduceExampleTest {

  private ReduceExample reduceExample;

  @Before
  public void init() {
    reduceExample = new ReduceExample();
  }

  @Test
  public void getMaxElement() {
    Assertions.assertEquals(7, reduceExample.getMaxElement() );
  }

  @Test
  public void sum() {
    Assertions.assertEquals(45, reduceExample.sum() );
  }

  @Test
  public void sum02() {
    Assertions.assertEquals(14, reduceExample.sum02() );

  }

  @Test
  public void computeMaxAge() {
    Assertions.assertEquals("Test9", reduceExample.computeMaxSalary().getName() );

  }
}
