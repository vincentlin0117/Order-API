package com.example.OrdersAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrdersAPI.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    
}
