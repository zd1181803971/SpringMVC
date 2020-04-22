package com.dzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类会被Spring接管，被这个注解的类，中的所有的方法，如果返回值是String，
            //并且有具体页面可以跳转，那么就会被视图解析器解析。
public class ControllerTest {

    @RequestMapping("/test")
    public String test(Model model){

        model.addAttribute("msg","test");
        return "test";
    }
}