package org.learning.problems.multithread;

import java.util.LinkedList;

public class ConsumerThread  extends Thread {

  private  LinkedList<String> linkedList;

  public ConsumerThread(LinkedList<String> linkedList) {
    this.linkedList = linkedList;
  }

  @Override
  public void run() {
    try {
      while (true) {
        synchronized (this){
          while (linkedList.size() == 0) {
            wait();
          }

          String element = linkedList.pop();
          System.out.println("This element is consumed by Thread:: "+ Thread.currentThread().getName() +" element:: " + element);

          //notify this to producer
          notifyAll();

          //and sleep
          Thread.sleep(100);
        }

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
