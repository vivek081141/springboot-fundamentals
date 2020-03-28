package org.learning.multithreading.controller;

import org.learning.multithreading.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController("/Multithreading")
@RequestMapping("/Multithreading")
public class AsyncController {

    @Autowired
    private UserService service;


    @RequestMapping(value="/saveUser", method = RequestMethod.POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity saveUser(@RequestParam (value ="files")MultipartFile[] files){

       // ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(MultipartFile file: files){
            service.saveUser(file);
        }
        return  ResponseEntity.status(HttpStatus.OK).build();
    }
}
