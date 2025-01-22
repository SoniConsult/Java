package com.springApi.CourseRegistrationSystem.service;

import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    UserRepo repo;
   public void addUser(User user){
       repo.save(user);
   }
}
