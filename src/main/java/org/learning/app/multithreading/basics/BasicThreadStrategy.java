package org.learning.app.multithreading.basics;

import org.learning.app.multithreading.workers.CSVFileHandler;
import java.util.Map;

public class BasicThreadStrategy extends BaseThread implements ThreadStrategy {

  public BasicThreadStrategy(Map<String, Object> config) {
    super(config);
  }

  @Override
  public void execute() {
    for (int i = 0; i < fileSize; i++) {
      CSVFileHandler handler = new CSVFileHandler();
      handler.inputFile = filePrefix + i + ".csv";
      handler.outPutFile = filePrefix + i + ".txt";
      Thread thread = new Thread(handler);
      thread.setName("Thread " + i);
      thread.start();
    }
    System.out.println("JOb COMPLETED");
  }

}
