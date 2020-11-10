package org.learning.problems.deadlock;


/**
 * Thread 1 has access of resource 1 and is waiting for getting lock on resource 2
 * Thread 2 has access of resource 2 and is waiting for getting lock in resource 1
 */

public class DeadLock {
  String resource1 = "RESOURCE1";
  String resource2 = "RESOURCE2";

  public void task1() {
    synchronized (resource1){
      System.out.println(Thread.currentThread().getName() + " I am having access of resource 1");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " I am waiting for access of resource 2");
      synchronized (resource2){
        System.out.println(Thread.currentThread().getName() + " I am having access of resource 2");
      }
    }
  }

  public void task2() {
    synchronized (resource2){
      System.out.println(Thread.currentThread().getName() + " I am having access of resource 2");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " I am waiting for access of resource 1");
      synchronized (resource1){
        System.out.println(Thread.currentThread().getName() + " I am having access of resource1 ");
      }
    }
  }
}
