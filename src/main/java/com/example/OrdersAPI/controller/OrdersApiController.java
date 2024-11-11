package com.example.OrdersAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.OrdersAPI.entity.Item;
import com.example.OrdersAPI.entity.Order;
import com.example.OrdersAPI.entity.User;
import com.example.OrdersAPI.service.ItemService;
import com.example.OrdersAPI.service.OrderService;
import com.example.OrdersAPI.service.UserService;

@RestController
public class OrdersApiController {
    @Autowired
    UserService userService;

    @Autowired
    OrderService orderService;

    @Autowired
    ItemService itemService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> ulist = userService.getAllUsers();
        return ResponseEntity.status(200).body(ulist);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> olist = orderService.getAllOrders();
        return ResponseEntity.status(200).body(olist);
    }
    
    @GetMapping("/items")
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> ilist = itemService.getAllItems();
        return ResponseEntity.status(200).body(ilist);
    }

    @GetMapping("/orders/{userID}")
    public ResponseEntity<List<Order>> getAllOrdersFromUser(@PathVariable int userID){
        List<Order> olist = orderService.getAllOrdersFromUser(userID);
        return ResponseEntity.status(200).body(olist);
    }
}
