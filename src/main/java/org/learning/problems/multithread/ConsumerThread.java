package org.learning.problems.multithread;

public class ConsumerThread  extends Thread {
  private SharedResource buffer;


  public ConsumerThread(SharedResource buffer) {
    this.buffer = buffer;
  }


  @Override
  public void run() {
    try {
      buffer.consume();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
