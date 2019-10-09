package com.quming.service.impl;

import com.quming.entity.Order;
import com.quming.mapper.OrderMapper;
import com.quming.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAllOrder() {
        return orderMapper.selectAllOrder();
    }
}
