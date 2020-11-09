package org.learning.problems.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Producer Consumer Pattern using BlockingQueue
 * Simpler way of accessing shared resource by multiple threads.
 */
public class BlockingQueueDemo {

  public static void main(String[] args) {
    ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

    Producer producer = new Producer(blockingQueue);
    Thread consumer = new Thread(new Consumer(blockingQueue));

    producer.start();
    consumer.start();
  }
}
