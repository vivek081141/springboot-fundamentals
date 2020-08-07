package org.learning.app.multithreading.workers;

import org.learning.app.multithreading.basics.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CSVFileHandler implements Runnable {
    public String inputFile;
    public String outPutFile;

    public void csvFileEditor(String file,String outPutFile){
        long start = System.currentTimeMillis();
        List<User> inputList = null;
        try{
            File inputFile = new File(file);
            InputStream inputFS = new FileInputStream(inputFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            // skip the header of the csv
            inputList = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
            br.close();
            System.out.println("Thread::"+Thread.currentThread().getName());
            System.out.println("FileName ::"+file +" No. of records "+inputList.size()  );
            System.out.println("Time Taken :: "+(System.currentTimeMillis()-start));
         //   inputList.forEach(x -> System.out.println(x.toString()));
        } catch ( IOException e) {
            e.printStackTrace();
        }

        //writing
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(outPutFile))){
           inputList.forEach(x -> write(writer, x));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void write(BufferedWriter writer, User x) {
        try {
            writer.write(x.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Function<String, User> mapToItem = (line) -> {
        String[] p = line.split(",");// a CSV has comma separated lines
        User item = new User();
        item.id = p[0];//<-- this is the first column in the csv file
        item.firstName = p[1];
        item.lastName = p[2];
        item.email = p[3];
        item.gender = p[4];
        item.city = p[5];
        //more initialization goes here
        return item;
    };

    @Override
    public void run() {
        csvFileEditor(inputFile,outPutFile);
    }
}
