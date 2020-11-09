package org.learning.problems.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {
  private  ArrayBlockingQueue<String> blockingQueue;

  public Producer(ArrayBlockingQueue<String> blockingQueue) {
    this.blockingQueue = blockingQueue;
  }

  @Override
  public void run() {

    while (true) {
      Double random = Math.random();
      try {
        System.out.println("Producing " + random.toString());
        this.blockingQueue.put(random.toString());
      }catch (InterruptedException e){
        e.printStackTrace();
      }
    }


  }
}
