package org.learning.problems.race.condition;

public class ThreadSafeCounter {

  private ThreadLocal<Long> count = ThreadLocal.withInitial( ()-> 0l);

  public void increaseCounter() {

    count.set((count.get()+1));
  }

  public long getCount() {
    return count.get();
  }
}
