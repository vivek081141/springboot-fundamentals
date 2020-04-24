/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This singleton pattern is tested by SingletonExampleTest using Executors
 */
public class SingletonExample {
    private static final Logger logger = LoggerFactory.getLogger(SingletonExample.class);

    private static SingletonExample _instance;

    private SingletonExample(){
        //please dont create a new instance
    }

    public static SingletonExample getInstance(){
        if(_instance == null){
            synchronized (SingletonExample.class){
                if(_instance == null){
                    logger.info("New Object is being created.");
                    _instance = new SingletonExample();
                }
            }
        }
        return _instance;
    }
}
