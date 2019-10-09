package com.quming.controller;
import	java.util.SortedSet;

import com.quming.entity.Order;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * author woson
 * date 2019/9/25
 * description
 */
@RestController
@RequestMapping("/form")
public class QumFormController {

    @RequestMapping(value="/unborn",method = {RequestMethod.POST,RequestMethod.GET})
    public Object unborn(){
        Order order = new Order();
        order.setOrderId(00000001l);
        order.setOrderState(1);
        return order;
    }

    @RequestMapping(value="/born",method = {RequestMethod.POST,RequestMethod.GET})
    public Object born(Order order){
        System.out.println(order.toString());
        return order;
    }
}
