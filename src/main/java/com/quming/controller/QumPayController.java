package com.quming.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quming.entity.Order;
import com.quming.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author woson
 * date 2019/9/25
 * description 支付
 */
@RestController
@RequestMapping("/pay")
public class QumPayController {

    private static final Logger logger = LoggerFactory.getLogger(QumPayController.class);


    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/nativePay",method = {RequestMethod.POST,RequestMethod.GET})
    public Object nativePay(Order order){
        PageHelper.startPage(1,5);
        List<Order> list = orderService.selectAllOrder();
        PageInfo<Order> pageInfo = new PageInfo<Order>(list);
        return pageInfo;
    }

    @RequestMapping(value="/jsapiPay",method = {RequestMethod.POST,RequestMethod.GET})
    public Object jsapiPay(Order order){
        return null;
    }
}
