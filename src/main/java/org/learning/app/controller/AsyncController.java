package org.learning.app.controller;

import org.learning.app.entity.User;
import org.learning.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/Multithreading")
public class AsyncController {

    @Autowired
    private UserService service;

    /**
     * Observation: Async is taking half the time of manual request.
     * @param files
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @RequestMapping(value="/saveUserViaAsync", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveUserViaAsync(@RequestParam (value ="files")MultipartFile[] files) throws ExecutionException, InterruptedException {
        List<CompletableFuture> list = new ArrayList<>();
       // ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(MultipartFile file: files){
            CompletableFuture<List<User>> users = service.saveUser(file);
            list.add(users);
        }

        for(CompletableFuture future:list){
            future.get();
        }
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value="/saveUsers", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveUsers(@RequestParam (value ="files")MultipartFile[] files){
        List<User> userList = new ArrayList<>();
        for(MultipartFile file: files){
            userList.addAll(service.saveUsers(file));
        }
        return  ResponseEntity.status(HttpStatus.OK).body(userList.size());
    }
}
