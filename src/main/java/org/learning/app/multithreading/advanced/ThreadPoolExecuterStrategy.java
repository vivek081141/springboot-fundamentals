package org.learning.app.multithreading.advanced;

import org.learning.app.multithreading.basics.BaseThread;
import org.learning.app.multithreading.basics.ThreadStrategy;
import org.learning.app.multithreading.workers.CSVFileHandler2;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecuterStrategy extends BaseThread implements ThreadStrategy {


    public ThreadPoolExecuterStrategy(Map<String, Object> config) {
        super(config);
    }

    @Override
    public void execute() {
        long time = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<100;i++){
            CSVFileHandler2 handler = new CSVFileHandler2();
            handler.inputFile = filePrefix+0+".csv";
            handler.outPutFile = filePrefix+0+".txt";
            //handler.run(); //303
            Future<String> future = executorService.submit(handler);
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("JOb COMPLETED: Total Time " + (System.currentTimeMillis() - time ));
    }
}
