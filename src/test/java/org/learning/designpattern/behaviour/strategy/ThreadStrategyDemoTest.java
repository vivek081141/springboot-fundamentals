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

import org.junit.Test;
import org.learning.designpattern.behaviour.strategy.runner.FileEditingTaskRunner;
import org.learning.designpattern.behaviour.strategy.strategies.AdvancedTaskExecutionStrategy;
import org.learning.designpattern.behaviour.strategy.strategies.BasicTaskExecutionStrategy;
import org.learning.designpattern.behaviour.strategy.strategies.IThreadStrategy;
import java.util.ArrayList;
import java.util.List;


/**
 * The idea for strategy pattern is that the client should not know about
 * the algorithm or the strategy used.
 * Decoupling the algorithm from the one who is using the algorithm
 * for eg: List should provide sort functionality, but let client pass which sorting
 * algorithm is required.
 * <p>
 * In this test, we are providing the TaskExecution strategy to fileEditor
 */
public class ThreadStrategyDemoTest {

  @Test
  public void advancedTest() {
    List<String> fileNames = new ArrayList<>();
    fileNames.add("INPUT_MOCK_DATA_00.csv");
    fileNames.add("INPUT_MOCK_DATA_01.csv");
    fileNames.add("INPUT_MOCK_DATA_02.csv");
    IThreadStrategy executionStrategy = new AdvancedTaskExecutionStrategy(new FileEditingTaskRunner(), fileNames);
    FileEditor fileEditor = new FileEditor(executionStrategy);
    fileEditor.performTask();
  }

  @Test
  public void basicTaskExecutionTest() {
    List<String> fileNames = new ArrayList<>();
    fileNames.add("INPUT_MOCK_DATA_00.csv");
    fileNames.add("INPUT_MOCK_DATA_01.csv");
    fileNames.add("INPUT_MOCK_DATA_02.csv");
    IThreadStrategy executionStrategy = new BasicTaskExecutionStrategy(new FileEditingTaskRunner(), fileNames);
    FileEditor fileEditor = new FileEditor(executionStrategy);
    fileEditor.performTask();
  }
}