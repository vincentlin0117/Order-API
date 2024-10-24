package com.example.OrdersAPI.entity.OrderItemLink;

import jakarta.persistence.*;

@Entity
@Table(name="orderItemLink")
public class OrderItemLink {
    @EmbeddedId
    private OrderItemKey id;

    @ManyToOne
    @MapsId("orderNum")
    @JoinColumn(name = "orderNum")
    private int orderNum;

    private int itemId;

    private int amount;
    
    public OrderItemLink(){

    }

    public OrderItemLink(int orderNum, int itemId, int amount){
        this.orderNum = orderNum;
        this.itemId = itemId;
        this.amount = amount;
        this.id = new OrderItemKey(orderNum,itemId);
    }
    
    public OrderItemKey getId() {
        return id;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public int getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(OrderItemKey id) {
        this.id = id;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
