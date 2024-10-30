package com.example.OrdersAPI.entity.OrderItemLink;

import com.example.OrdersAPI.entity.Item;
import com.example.OrdersAPI.entity.Order;

import jakarta.persistence.*;

@Entity
@Table(name="orderItemLink")
public class OrderItemLink {
    @EmbeddedId
    private OrderItemKey id;

    @ManyToOne
    @MapsId("orderNum")
    @JoinColumn(name = "orderNum")
    private Order order;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "itemId")
    private Item item;

    private Integer amount;
    
    public OrderItemLink(){

    }

    public OrderItemLink(Order order, Item item, int amount){
        this.order = order;
        this.item = item;
        this.amount = amount;
        this.id = new OrderItemKey(order.getOrderId(),item.getItemId());
    }
    
    public OrderItemKey getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public Item getItem() {
        return item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setId(OrderItemKey id) {
        this.id = id;
    }

    public void setOrderNum(Order orderNum) {
        this.order = orderNum;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
