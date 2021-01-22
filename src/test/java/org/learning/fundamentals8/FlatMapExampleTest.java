/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.learning.java8.FlatMapExample;
import org.learning.java8.models.Person;
import java.util.List;

public class FlatMapExampleTest {

  private FlatMapExample flatMapExample;
  @Before
  public void init() {
    flatMapExample = new FlatMapExample();
  }

  @Test
  public void addList01() {
    List<Person> personList = flatMapExample.addArrayList();
    Assertions.assertEquals(15 ,personList.size());
  }

  @Test
  public void addStreamsOfStreams() {
    List<Person> personList = flatMapExample.addStreamsOfStreams();
    Assertions.assertEquals(15 ,personList.size());
  }

  @Test
  public void addStreams() {
    List<Person> personList = flatMapExample.addStreams();
    Assertions.assertEquals(15 ,personList.size());
  }
}
