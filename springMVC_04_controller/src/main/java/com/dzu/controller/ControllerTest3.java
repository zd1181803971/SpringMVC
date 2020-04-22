package com.dzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类会被Spring接管，被这个注解的类，中的所有的方法，如果返回值是String，
//并且有具体页面可以跳转，那么就会被视图解析器解析。

@RequestMapping("/c2")
public class ControllerTest3 {

    //原来的  8080/test2?a=1&b=2
    //RestFul 8080/test2/1/2
    //简洁 高效。更安全
    @GetMapping("/test2/{a}/{b}")//get方式
    public String test(@PathVariable int a , @PathVariable int b , Model model){
        int res = a + b ;
        model.addAttribute("msg","test2"+res);
        return "test";
    }
}