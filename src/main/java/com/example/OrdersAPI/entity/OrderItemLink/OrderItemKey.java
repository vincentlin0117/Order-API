package com.example.OrdersAPI.entity.OrderItemLink;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderItemKey implements Serializable {
    private Integer orderPk;
    private Integer itemPk;

    public OrderItemKey(){

    }

    public OrderItemKey(int orderPk, int itemPk){
        this.orderPk = orderPk;
        this.itemPk = itemPk;
    }

    public Integer getOrderPk() {
        return orderPk;
    }

    public Integer getItemPk() {
        return itemPk;
    }

    public void setOrderPk(int orderPk) {
        this.orderPk = orderPk;
    }

    public void setItemPk(int itemPk) {
        this.itemPk = itemPk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemKey that = (OrderItemKey) o;
        return orderPk == that.orderPk && itemPk == that.itemPk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderPk, itemPk);
    }
}
