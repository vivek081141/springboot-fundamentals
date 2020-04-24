package org.learning.app.service;

import org.learning.app.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface UserService {
    CompletableFuture<List<User>> saveUser(MultipartFile file);
    List<User> saveUsers(MultipartFile file);
}
