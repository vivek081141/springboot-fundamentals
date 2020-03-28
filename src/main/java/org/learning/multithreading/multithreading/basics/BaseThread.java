package org.learning.multithreading.multithreading.basics;

import java.util.Map;

public abstract class BaseThread {
    protected int fileSize;
    protected String filePrefix;

    public  BaseThread(Map<String, Object> config){
        fileSize = Integer.parseInt(config.get("FILE_SIZE").toString());
        filePrefix = config.get("FILE_PREFIX").toString();
    }
}
