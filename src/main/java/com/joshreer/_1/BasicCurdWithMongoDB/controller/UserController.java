package com.joshreer._1.BasicCurdWithMongoDB.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joshreer._1.BasicCurdWithMongoDB.entity.UserDetails.User;
import com.joshreer._1.BasicCurdWithMongoDB.service.UserService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    UserController( UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> GetUsers() 
    {
        return userService.getUsers();
    }

    @PostMapping("/addUser")
    public User CreatUser(@RequestBody User user) 
    {
        LOGGER.info(String.format("Calling CreateUser"));
        return userService.CreateUser(user);   
    }

    @GetMapping("{myId}")
    public Optional<User> FindUserByID(@RequestParam String id) {
        return userService.FindUserByID(id);
    }
    
}
