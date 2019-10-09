package com.quming.controller;

import com.quming.entity.Order;
import com.quming.enums.OrderStateEnum;
import com.quming.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author woson
 * date 2019/9/25
 * description 表单提交api
 */
@RestController
@RequestMapping("/form")
public class QumFormController {

    private static final Logger logger = LoggerFactory.getLogger(QumFormController.class);


    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/unborn",method = {RequestMethod.POST,RequestMethod.GET})
    public Object unborn(){
        Order order = new Order();
        order.setOrderId(00000001l);
        order.setOrderState(1);
        return order;
    }

    @RequestMapping(value="/born",method = {RequestMethod.POST,RequestMethod.GET})
    public Object born(Order order){
        order.setOrderState(OrderStateEnum.ORDERSTATE_UNPAY.getOrderState());
        orderService.insertOrder(order);
        order = orderService.selectOrderById(order.getOrderId());
        logger.info(order.toString());
        return order;
    }
}
