package org.learning.problems.race.condition;

import org.junit.Assert;
import org.junit.Test;

/**
 * THis is to reproduce Race Counter, which can be easily avoided by using
 * sysnchronization in critical section of the code.
 */
public class RaceConditionDemoTest {

  @Test
  public void reproduceRaceCondition() {
    Counter counter = new Counter();

    Thread t1 = new Thread(() -> {
      for (long j = 0; j < 1000000; j++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 1::" + counter.getCount());
    }, "Thread 1");

    Thread t2 = new Thread(() -> {
      for (long i = 0; i < 1000000; i++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 2::" + counter.getCount());
    }, "Thread 2");

    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //this value will never be equal to 2 million as we are expecting.
    System.out.println(counter.getCount());
  }

  /**
   * The Java ThreadLocal class enables you to create variables that can only be read and written by the same thread.
   * Thus, even if two threads are executing the same code, and the code has a reference to the same ThreadLocal variable,
   * the two threads cannot see each other's ThreadLocal variables.
   * Thus, the Java ThreadLocal class provides a simple way to make code thread safe that would not otherwise be so.
   */
  @Test
  public void threadSafeCounterTest() {
    ThreadSafeCounter counter = new ThreadSafeCounter();

    Thread t1 = new Thread(() -> {
      for (long j = 0; j < 1000000; j++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 1::" + counter.getCount());
      Assert.assertEquals(1000000, counter.getCount());
    }, "Thread 1");

    Thread t2 = new Thread(() -> {
      for (long i = 0; i < 1000000; i++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 2::" + counter.getCount());
      Assert.assertEquals(1000000, counter.getCount());

    }, "Thread 2");

    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(counter.getCount());

    //this is main thread, so the threadLocal variable be set to 1.
    Assert.assertEquals(1, counter.getCount());

  }


  /**
   * ThreadSafety can be ensured by surrounding the critical section of the code by
   * synchronized block, this will make sure that only one thread will enter the
   * block, I personally liked the use of threadlocal variable - it won't compromise on performance
   * However, it need to be kept in mind, its value should be initialized for each and every thread.
   */
  @Test
  public void syncCounterTest() {
    SynchronizedCounter counter = new SynchronizedCounter();

    Thread t1 = new Thread(() -> {
      for (long i = 0; i < 1000000; i++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 1" + counter.getCount());

    }, "Thread 1");

    Thread t2 = new Thread(() -> {
      for (long i = 0; i < 1000000; i++) {
        counter.increaseCounter();
      }
      System.out.println("Thread 2" + counter.getCount());

    }, "Thread 2");

    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }


    System.out.println(counter.getCount());
    Assert.assertEquals(2000000, counter.getCount());
  }

}