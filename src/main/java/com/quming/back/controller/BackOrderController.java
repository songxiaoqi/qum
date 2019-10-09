package com.quming.back.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quming.controller.QumFormController;
import com.quming.entity.Order;
import com.quming.enums.OrderStateEnum;
import com.quming.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 后台操作订单页面
 */
@RestController
@RequestMapping("/back/order")
public class BackOrderController {

    private static final Logger logger = LoggerFactory.getLogger(QumFormController.class);

    @Autowired
    private OrderService orderService;

    /**
     * 条件分页查询订单
     */
    @RequestMapping(value="/list",method = {RequestMethod.POST,RequestMethod.GET})
    public Object listPage(Order order,int pageNo,int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<Order> list = orderService.selectAllOrder();
        PageInfo<Order> pageInfo = new PageInfo<Order>(list);
        return pageInfo;
    }

    /**
     * 后台处理订单（第三方下单）
     */
    @RequestMapping(value="/dealDo",method = {RequestMethod.POST,RequestMethod.GET})
    public Object dealDo(Order order){
        Order order1 = orderService.selectOrderById(order.getOrderId());
        if(null!=order1&&order1.getOrderState().equals(OrderStateEnum.ORDERSTATE_PAYED.getOrderState())){
            return orderService.updateOrderStateById(order);
        }
        return "更新失败";

    }
}
