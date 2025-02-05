package com.blog.app.controller;

import com.blog.app.entities.UserEntity;
import com.blog.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public UserEntity newUser(@RequestBody UserEntity userEntity) {
        return userService.addNewUser(userEntity);
    }
}
