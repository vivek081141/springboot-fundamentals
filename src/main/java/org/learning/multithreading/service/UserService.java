package org.learning.multithreading.service;

import org.learning.multithreading.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface UserService {
    CompletableFuture<List<User>> saveUser(MultipartFile file);
    List<User> saveUsers(MultipartFile file);
}
