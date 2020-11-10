package org.learning.problems.prodcons;


import java.util.LinkedList;

/**
 * SharedResource (linkedList) is used by Producer and Consumer both,
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

    LinkedList<String> linkedList = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
      ProducerThread thread = new ProducerThread(linkedList);
      thread.setName("Thread " + i);
      thread.start();
    }

    for (int i = 0; i < 1; i++) {
      ConsumerThread consumerThread = new ConsumerThread(linkedList);
      consumerThread.setName("Thread " + i);
      consumerThread.start();

    }
  }
}
