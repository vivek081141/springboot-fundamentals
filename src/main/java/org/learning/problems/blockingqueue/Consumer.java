package org.learning.problems.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
  private ArrayBlockingQueue<String> blockingQueue;

  public Consumer(ArrayBlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {
    while (true) {
      try {
        String take = blockingQueue.take();
        System.out.println("Consuming " + take);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
