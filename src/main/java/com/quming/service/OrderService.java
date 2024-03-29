package com.quming.service;

import com.quming.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> selectAllOrder();

    int insertOrder(Order order);

    Order selectOrderById(Long orderId);

    int updateOrderStateById(Order order);

}
