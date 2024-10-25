package com.example.OrdersAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrdersAPI.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{
    
}
