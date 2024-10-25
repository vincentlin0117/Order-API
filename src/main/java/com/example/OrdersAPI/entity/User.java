package com.example.OrdersAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tblUser")
public class User {
    @Column(name="userId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String username;

    private String password;

    public User(){

    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(Integer userId, String username, String password){
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Integer getUserId(){
        return userId;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setAccountId(Integer userId){
        this.userId = userId;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
