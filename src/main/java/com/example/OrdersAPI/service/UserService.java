package com.example.OrdersAPI.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrdersAPI.entity.User;
import com.example.OrdersAPI.repository.UserRepository;

@Service
public class UserService {
    
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
