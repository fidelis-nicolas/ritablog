package com.blog.app.UserService;

import com.blog.app.Entities.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();
    UserEntity addNewUser(UserEntity userEntity);
}
