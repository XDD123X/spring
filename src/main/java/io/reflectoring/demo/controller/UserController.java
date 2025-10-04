package io.reflectoring.demo.controller;

import io.reflectoring.demo.dto.request.UserRequest;
import io.reflectoring.demo.entity.User;
import io.reflectoring.demo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User create(@RequestBody UserRequest user){
        return userService.CreateRequest(user);
    }
}
