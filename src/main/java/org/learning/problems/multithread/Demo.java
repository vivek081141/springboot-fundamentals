package org.learning.problems.multithread;


/**
 * SharedResource is used by Producer and Consumer both,
 * producer will keep adding to shared resources,
 * consumer will keep consuming data
 *
 * 1. wait, notify work only on synchronized blocks
 * 2. wait will put a wait on the current resource from getting accessed by multiple threads
 * 3. notify - notify all the thread which are blocked by current resource
 *
 */
public class Demo {

  public static void main(String[] args) {

    SharedResource resource = new SharedResource();

    for (int i = 0; i < 10; i++) {
      ProducerThread thread = new ProducerThread(resource);
      thread.setName("Thread " + i);
      thread.start();
    }

    for (int i = 0; i < 1; i++) {
      ConsumerThread consumerThread = new ConsumerThread(resource);
      consumerThread.setName("Thread " + i);
      consumerThread.start();

    }
  }
}
