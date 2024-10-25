package com.example.OrdersAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrdersAPI.entity.OrderItemLink.OrderItemLink;

public interface OrderItemLinkRepository extends JpaRepository<OrderItemLink,Integer> {
    
}
