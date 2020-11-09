package org.learning.problems.threadlocal;

/**
 * ThreadLocal will create new instance of private variable for each thread,
 * thus making private variables thread safe
 */
public class ThreadLocalDemo {

  public static void main(String[] args) {

    Test test = new Test();

    Thread t1 = new Thread( () -> {

      test.setName("Thread One");

      try {
        //enough time for t2 to change value
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Test name will be still equal to thread one " + test.getName().equals("Thread One"));
    });

    Thread t2 = new Thread( () -> {

      test.setName("Thread Two");

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Test name will be still equal to thread two " + test.getName().equals("Thread Two"));

    });

    t1.start();
    t2.start();
  }
}
