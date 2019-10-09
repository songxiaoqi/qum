package com.quming.mapper;

import com.quming.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<Order> selectAllOrder();

    int insertOrder(Order order);

    Order selectOrderById(@Param("orderId") Long orderId);

    int updateOrderStateById(Order order);

}
