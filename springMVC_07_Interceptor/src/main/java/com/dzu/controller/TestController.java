package com.dzu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/t1")
    public String test1(){
        System.out.println("执行了");
        return "ok";
    }
}
