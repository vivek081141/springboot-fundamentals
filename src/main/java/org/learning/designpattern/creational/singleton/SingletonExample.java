/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.singleton;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This singleton pattern is tested by SingletonExampleTest using Executors
 */
public class SingletonExample {
  private static final Logger logger = LoggerFactory.getLogger(SingletonExample.class);

  @SuppressWarnings("checkstyle:StaticVariableName")
  private static SingletonExample instance;

  private SingletonExample() {
    //please dont create a new instance
  }

  @SuppressFBWarnings("DC_DOUBLECHECK")
  public static SingletonExample getInstance() {
    if (instance == null) {
      synchronized (SingletonExample.class) {
        if (instance == null) {
          logger.info("New Object is being created.");
          instance = new SingletonExample();
        }
      }
    }
    return instance;
  }
}
