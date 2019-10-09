package com.quming.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 订单实体
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -1419631441080310078L;

    private Long orderId;

    private Integer orderState;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}
