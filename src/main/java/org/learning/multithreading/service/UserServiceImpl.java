package org.learning.multithreading.service;

import org.learning.multithreading.entity.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    @Async
    public void saveUser(MultipartFile file) {

        List<User> userList = parseCSVFile(file);

    }

    private List<User> parseCSVFile(MultipartFile file) {

    }
}
