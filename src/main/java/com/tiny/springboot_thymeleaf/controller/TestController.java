package com.tiny.springboot_thymeleaf.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    Logger log = LoggerFactory.getLogger(getClass());
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

