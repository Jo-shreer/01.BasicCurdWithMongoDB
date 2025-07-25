package com.joshreer._1.BasicCurdWithMongoDB.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.joshreer._1.BasicCurdWithMongoDB.entity.UserDetails.User;
import com.joshreer._1.BasicCurdWithMongoDB.repository.UserRepository;

@Service
public class UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User CreateUser(User user)
    {
        LOGGER.info(String.format("userRepository.save(user)"));
        return userRepository.save(user);
    }

    public Optional<User> FindUserByID(String id)
    {
        return userRepository.findById(id);
    }


}
