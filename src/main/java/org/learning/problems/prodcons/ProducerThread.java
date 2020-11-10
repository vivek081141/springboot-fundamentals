package org.learning.problems.prodcons;

import java.util.LinkedList;

public class ProducerThread extends Thread{

  int capacity = 20;
  private LinkedList<String> list;


  public ProducerThread(LinkedList<String> list) {
    this.list = list;
  }


  @Override
  public void run() {
    try {
      while (true) {
        synchronized (this){
          //handle full condition
          while (list.size() == capacity) {
            wait();
          }

          Double random = Math.random();
          System.out.println("This element is produced by Thread:: "+ Thread.currentThread().getName() +" element:: " + random);
          list.push(random.toString());

          //notify to consumer
          notifyAll();

          Thread.sleep(100);
        }

      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
