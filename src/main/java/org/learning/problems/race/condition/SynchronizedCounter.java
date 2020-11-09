package org.learning.problems.race.condition;

public class SynchronizedCounter {
  private long count = 0;

  public void increaseCounter(){
    synchronized (this){
      count++;
    }

  }

  public long getCount() {
    return count;
  }
}
