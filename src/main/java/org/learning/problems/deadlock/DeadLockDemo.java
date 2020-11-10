package org.learning.problems.deadlock;


/**
 * Thread 1 has access of resource 1 and is waiting for getting lock on resource 2
 * Thread 2 has access of resource 2 and is waiting for getting lock in resource 1
 */
public class DeadLockDemo {

  public static void main(String[] args) {
    String resource1 = "RESOURCE1";
    String resource2 = "RESOURCE2";

    Thread t1 = new Thread( () -> {

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


    }, "Thread1");


    Thread t2 = new Thread( () -> {

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


    }, "Thread2");

    t1.start();
    t2.start();

  }
}
