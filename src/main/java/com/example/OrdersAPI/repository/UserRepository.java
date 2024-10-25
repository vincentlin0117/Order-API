package com.example.OrdersAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.OrdersAPI.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    
} 
