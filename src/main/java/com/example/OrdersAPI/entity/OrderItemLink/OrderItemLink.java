package com.example.OrdersAPI.entity.OrderItemLink;

import jakarta.persistence.*;

@Entity
@Table(name="orderItemLink")
public class OrderItemLink {
    @EmbeddedId
    private OrderItemKey id;

    private Integer orderNum;

    private Integer itemNum;

    private Integer amount;
    
    public OrderItemLink(){

    }

    public OrderItemLink(int orderNum, int itemNum, int amount){
        this.orderNum = orderNum;
        this.itemNum = itemNum;
        this.amount = amount;
        this.id = new OrderItemKey(orderNum,itemNum);
    }
    
    public OrderItemKey getId() {
        return id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setId(OrderItemKey id) {
        this.id = id;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
