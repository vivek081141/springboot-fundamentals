package org.learning.app.multithreading.advanced;

import org.learning.app.multithreading.basics.BaseThread;
import org.learning.app.multithreading.workers.CSVFileHandler;
import org.learning.app.multithreading.basics.ThreadStrategy;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//598,655 ms when ran without using Threadng
//588 when using 1 thread in executerService
//493 when using 10 threads


//Reading plus writing
//996 using 10 thread
//1139 using 1 thread
//1071 using no thread
public class ThreadUsingExecutorPoolStrategy extends BaseThread implements ThreadStrategy {

    public ThreadUsingExecutorPoolStrategy(Map<String, Object> config) {
       super(config);
    }

    @Override
    public void execute() {
        long time = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<100;i++){
            CSVFileHandler handler = new CSVFileHandler();
            handler.inputFile = filePrefix+0+".csv";
            handler.outPutFile = filePrefix+0+".txt";
            //handler.run(); //303
            executorService.execute(handler);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("JOb COMPLETED: Total Time " + (System.currentTimeMillis() - time ));
    }
}
