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
package org.learning.designpattern.behaviour.strategy.strategies;

import org.learning.designpattern.behaviour.strategy.runner.IRunnable;
import java.util.List;

public class BasicTaskExecutionStrategy implements IThreadStrategy {

  private IRunnable fileEditingTaskRunner;
  private List<String> fileNames;

  public BasicTaskExecutionStrategy(IRunnable fileEditingTaskRunner, List<String> fileNames) {
    this.fileEditingTaskRunner = fileEditingTaskRunner;
    this.fileNames = fileNames;
  }

  @Override
  public void execute() {
    for (String fileName : fileNames) {
      fileEditingTaskRunner.setFileName(fileName);
      Thread thread = new Thread(fileEditingTaskRunner);
      thread.start();
    }


  }
}
