package com.bank.registration.controller;

import com.bank.registration.entity.User;
import com.bank.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/GetUserProfile")
    public Optional<User> getUserProfile(@RequestBody Long userName){
        return userService.getUserProfile(userName);
    }
}