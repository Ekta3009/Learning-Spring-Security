package com.example.SpringSecurity.controllers;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user){
        System.out.println("Login");
        return userService.verify(user);
    }
}
