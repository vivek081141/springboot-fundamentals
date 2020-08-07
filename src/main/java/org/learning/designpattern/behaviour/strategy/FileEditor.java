/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.strategy;

import org.learning.designpattern.behaviour.strategy.strategies.IThreadStrategy;

public class FileEditor {
  private IThreadStrategy executionStrategy;

  public FileEditor(IThreadStrategy executionStrategy) {
    this.executionStrategy = executionStrategy;
  }

  public void performTask() {
    this.executionStrategy.execute();
  }
}
