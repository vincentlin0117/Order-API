package com.example.OrdersAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name="order")
public class Order {
    
    @Column(name="orderNum")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderNum;

    private Integer orderUserId;

    private Double total;

    private String date;

    public Order(){

    }
    
    public Order(Integer orderUserId, Double total, String date){
        this.orderUserId = orderUserId;
        this.total = total;
        this.date = date;
    }

    public Order(Integer orderNum, Integer orderUserId, Double total, String date){
        this.orderNum = orderNum;
        this.orderUserId = orderUserId;
        this.total = total;
        this.date = date;
    }

    public Integer getOrderNum(){
        return orderNum;
    }

    public Integer getOrderUserId(){
        return orderUserId;
    }

    public Double getTotal(){
        return total;
    }

    public String getDate(){
        return date;
    }

    public void setOrderNum(Integer orderNum){
        this.orderNum = orderNum;
    }

    public void setOrderUserId(Integer orderUserId){
        this.orderUserId = orderUserId;
    }

    public void setTotal(Double total){
        this.total = total;
    }

    public void setDate(String date){
        this.date = date;
    }

}
