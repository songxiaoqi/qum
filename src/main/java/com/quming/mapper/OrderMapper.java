package com.quming.mapper;

import com.quming.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<Order> selectAllOrder();
}
