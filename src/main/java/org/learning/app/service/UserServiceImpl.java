package org.learning.app.service;

import org.learning.app.entity.User;
import org.learning.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    @Async
    public CompletableFuture<List<User>> saveUser(MultipartFile file) {
        long start = System.currentTimeMillis();
        System.out.println("Thread name :"+Thread.currentThread().getName());
        List<User> userList = parseCSVFile(file);
        repository.saveAll(userList);
        System.out.println("Time taken by method:: " + ( System.currentTimeMillis() - start));
        return CompletableFuture.completedFuture(userList);

    }

    @Override
    public List<User> saveUsers(MultipartFile file) {
        long start = System.currentTimeMillis();
        System.out.println("Thread name :"+Thread.currentThread().getName());
        List<User> userList = parseCSVFile(file);
        repository.saveAll(userList);
        System.out.println("Time taken by method:: " + ( System.currentTimeMillis() - start));
        return userList;
    }

    private List<User> parseCSVFile(MultipartFile file) {
        BufferedReader br;
        List<User> userList = new ArrayList<>();
        try {

            String line;
            InputStream is = file.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            br.lines().skip(1);
            while ((line = br.readLine()) != null) {
                String [] p = line.split(",");
                User item = new User();
                item.setFirstName(p[1]);
                item.setLastName(p[2]);
                item.setEmail(p[3]);
                item.setGender(p[4]);
                item.setCity(p[5]);
                userList.add(item);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return userList;
    }

    private Function<String, User> mapToItem = (line) -> {
        Map<String, User> map = new HashMap<>();
        String[] p = line.split(",");// a CSV has comma separated lines
        User item = new User();
        item.setFirstName(p[1]);
        item.setLastName(p[2]);
        item.setEmail(p[3]);
        item.setGender(p[4]);
        item.setCity(p[5]);
        return item;
    };
}
