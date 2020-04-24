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

package org.learning.designpattern.behaviour.strategy.runner;

import org.learning.app.multithreading.basics.User;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Runnable class to read a single file
 */
public class FileEditingTaskRunner implements IRunnable {
    private String fileName;

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        List<User> inputList;
        try{
            File inputFile = new ClassPathResource(fileName).getFile();
            InputStream inputFS = new FileInputStream(inputFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
            br.close();
            System.out.println("Thread::"+Thread.currentThread().getName());
            System.out.println("FileName ::"+fileName +" No. of records "+inputList.size()  );
            System.out.println("Time Taken :: "+(System.currentTimeMillis()-start));
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    private Function<String, User> mapToItem = (line) -> {
        Map<String,User> map = new HashMap<>();
        String[] p = line.split(",");
        User item = new User();
        item.id = p[0];
        item.firstName = p[1];
        item.lastName = p[2];
        item.email = p[3];
        item.gender = p[4];
        item.city = p[5];
        return item;
    };

}
