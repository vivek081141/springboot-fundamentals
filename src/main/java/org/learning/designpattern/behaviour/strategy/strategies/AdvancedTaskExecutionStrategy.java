/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.behaviour.strategy.strategies;

import org.learning.designpattern.behaviour.strategy.runner.IRunnable;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Advanced Threading execution in order to read a list of files using executor service
 * The execution strategy needs to know the list of file names which needs to be read
 * And the runner class which needs to run
 */
public class AdvancedTaskExecutionStrategy implements IThreadStrategy {
    private IRunnable fileEditingTaskRunner;
    private List<String> fileNames;

    public AdvancedTaskExecutionStrategy(IRunnable fileEditingTaskRunner, List<String> fileNames){
        this.fileEditingTaskRunner = fileEditingTaskRunner;
        this.fileNames = fileNames;
    }

    @Override
    public void execute() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(String fileName:fileNames){
            fileEditingTaskRunner.setFileName(fileName);
            executorService.execute(fileEditingTaskRunner);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }

    }
}
