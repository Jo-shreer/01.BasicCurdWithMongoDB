package com.joshreer._1.BasicCurdWithMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joshreer._1.BasicCurdWithMongoDB.entity.UserDetails.User;


public interface UserRepository extends MongoRepository<User, String> {

}
