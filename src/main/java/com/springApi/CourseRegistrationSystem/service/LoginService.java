package com.springApi.CourseRegistrationSystem.service;

import com.springApi.CourseRegistrationSystem.exception.UserNotFoundException;
import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepo repo;

    public User login(int id,String password) {
        User user = repo.findById(id).orElse(null);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            // If user not found or password mismatch, throw a custom exception
            throw new UserNotFoundException("User with id " + id + " not found or incorrect password");
        }
    }
}
