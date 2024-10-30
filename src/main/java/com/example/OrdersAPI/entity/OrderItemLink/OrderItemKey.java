package com.example.OrdersAPI.entity.OrderItemLink;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemKey implements Serializable {
    private Integer orderNum;
    private Integer itemId;

    public OrderItemKey(){

    }

    public OrderItemKey(int orderNum, int itemId){
        this.orderNum = orderNum;
        this.itemId = itemId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemKey that = (OrderItemKey) o;
        return orderNum == that.orderNum && itemId == that.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNum, itemId);
    }
}
