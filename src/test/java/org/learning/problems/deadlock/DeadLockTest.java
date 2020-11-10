package org.learning.problems.deadlock;

import org.junit.Test;


/**
 * Thread 1 has access of resource 1 and is waiting for getting lock on resource 2
 * Thread 2 has access of resource 2 and is waiting for getting lock in resource 1
 */

public class DeadLockTest {

  @Test
  public void deadLock() {
    DeadLock deadLock = new DeadLock();

    Thread t1 = new Thread(() -> {
      deadLock.task1();
    }, "ThreadOne");

    Thread t2 = new Thread(() -> {
      deadLock.task2();
    }, "ThreadTwo");

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}