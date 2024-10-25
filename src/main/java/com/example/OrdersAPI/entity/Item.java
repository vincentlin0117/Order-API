package com.example.OrdersAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Column(name="itemId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;

    private String name;

    private double price;

    public Item(){

    }
    
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setItemId(int itemId){
        this.itemId = itemId;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
