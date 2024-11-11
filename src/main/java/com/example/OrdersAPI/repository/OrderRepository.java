package com.example.OrdersAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrdersAPI.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    List<Order> findByOrderUserId(int userID);
}
