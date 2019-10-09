package com.quming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * author woson
 * date 2019/9/25
 * description
 */
@RestController
@RequestMapping("/quming")
public class QuMingHomeController {

    @RequestMapping(value="/qumingindex",method = {RequestMethod.GET})
    public ModelAndView qumingIndex(){
        return new ModelAndView("hello");
    }

    @RequestMapping(value="/index",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView vueTest2(){
        return new ModelAndView("index");
    }
}
