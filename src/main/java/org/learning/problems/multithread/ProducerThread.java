package org.learning.problems.multithread;

public class ProducerThread extends Thread{

  private SharedResource buffer;


  public ProducerThread(SharedResource buffer) {
    this.buffer = buffer;
  }


  @Override
  public void run() {
    try {
      buffer.produce();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
