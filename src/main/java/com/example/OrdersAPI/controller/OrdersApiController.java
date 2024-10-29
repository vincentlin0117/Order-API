package com.example.OrdersAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrdersAPI.entity.User;
import com.example.OrdersAPI.service.UserService;

@RestController
public class OrdersApiController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity getUser(){
        List<User> ulist = userService.getAllUsers();
        return ResponseEntity.status(200).body(ulist);
    }
}
