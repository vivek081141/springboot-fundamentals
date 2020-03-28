package org.learning.multithreading.multithreading.basics;

public class ThreadRunner {

    private ThreadStrategy strategy;

    public ThreadRunner(ThreadStrategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.execute();
    }
}
