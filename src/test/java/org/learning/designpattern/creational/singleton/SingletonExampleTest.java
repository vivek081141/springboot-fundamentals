/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.singleton;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Singleton pattern insures that only single instance of the class will be available during runtime
 * eg: Runtime.getRuntime()
 * There can be three types of Singleton
 * 1. static as in Runtime.getRuntime -> early loading
 * 2. lazy loading
 * 3. threadsafe - using synchronized block
 */
public class SingletonExampleTest {

  /**
   * lets create 10 threads
   **/
  @Test
  public void test() {

    Set<SingletonExample> set = new HashSet<>();
    BasicThreadFactory namedThreadFactory = new BasicThreadFactory.Builder().namingPattern("SingletonExampleTest-%d").daemon(true).priority(Thread.NORM_PRIORITY).build();
    ExecutorService executorService = Executors.newFixedThreadPool(1000, namedThreadFactory);
    for (int i = 0; i < 10000; i++) {
      executorService.execute(() -> {
        SingletonExample example = SingletonExample.getInstance();
        set.add(example);
      });
    }
    executorService.shutdown();
    while (!executorService.isTerminated()) {
    }

    Assert.assertEquals(1, set.size());

  }
}
