package org.learning.multithreading.config;

import java.util.Date;

public class RunnableTask implements Runnable {
    private String message;

    public RunnableTask(String message){
        this.message = message;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date()+" Runnable Task with "+ message
                +" on thread "+Thread.currentThread().getName());
    }
}
