package org.learning.app.multithreading.patterns;

public class LambdaTasks {

    public static void main(String[] args) {
        LambdaTasks task = new LambdaTasks();
        task.runnableExample();
    }

    public void runnableExample(){
        Runnable task = () -> getHello_world();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Task done");
    }

    private void getHello_world() {
        System.out.println("Hello World");
        try{
            throw new Exception("Exception Occurred");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
