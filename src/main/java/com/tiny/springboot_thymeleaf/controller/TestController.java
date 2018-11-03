package com.tiny.springboot_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "hello springboot world!";
    }
    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();

       // mv.addObject(new object());
        mv.setViewName("test");
        return mv;
    }
}

