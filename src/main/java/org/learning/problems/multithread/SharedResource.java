package org.learning.problems.multithread;

import java.util.LinkedList;

public class SharedResource {
  int capacity = 50;

  private LinkedList<String> list;

  public LinkedList<String> getList() {
    if (list == null) {
      list = new LinkedList<>();
    }
    return list;
  }

  public void consume() throws InterruptedException {

    while (true) {
      synchronized (this){
        while (getList().size() == 0) {
          wait();
        }

        String element = getList().pop();
        System.out.println("This element is consumed by Thread:: "+ Thread.currentThread().getName() +" element:: " + element);

        //notify this to producer
        notifyAll();

        //and sleep
        Thread.sleep(100);
      }

    }

  }

  public void produce() throws InterruptedException {

    while (true) {
      synchronized (this){
        //handle full condition
        while (getList().size() == capacity) {
          wait();
        }

        Double random = Math.random();
        System.out.println("This element is produced by Thread:: "+ Thread.currentThread().getName() +" element:: " + random);
        getList().push(random.toString());

        //notify to consumer
        notifyAll();

        Thread.sleep(100);
      }

    }
  }
}
