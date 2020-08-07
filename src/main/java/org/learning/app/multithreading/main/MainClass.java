package org.learning.app.multithreading.main;

import org.learning.app.multithreading.advanced.ThreadUsingExecutorPoolStrategy;
import org.learning.app.multithreading.basics.ThreadRunner;
import org.learning.app.multithreading.basics.ThreadStrategy;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of Runnable
 * Thread pool Executer vs Basic Threading
 * Callable vs Runnable
 */

public class MainClass {


  public static void main(String[] args) {
    //But the strategy may need some of the items
    Map<String, Object> config = new HashMap<>();
    config.put("FILE_SIZE", 10);
    config.put("FILE_PREFIX", "/Users/i350472/workspace/springboot/SpringBootSpringDataSolr/src/main/resources/INPUT_MOCK_DATA_0");
    ThreadStrategy strategy = new ThreadUsingExecutorPoolStrategy(config);
    ThreadRunner runner = new ThreadRunner(strategy);
    runner.run();

  }
}
