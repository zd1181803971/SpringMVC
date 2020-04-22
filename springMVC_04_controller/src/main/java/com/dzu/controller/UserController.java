package com.dzu.controller;


import com.dzu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t")
    public String userTest(@RequestParam("name") String name, Model model){
        //1.接受前端参数
        System.out.println(name);
        //2.将返回的结果传递给前端，model
        model.addAttribute("msg",name);
        //3.试图跳转
        return "test";
    }

    /*1.接受前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
    * 2. 假设传递的是一个对象User，匹配User对象中的字段名，如果名字一致则ok，否则 匹配不到*/
    @RequestMapping("/t2")
    public String userTest2(User user){
        System.out.println(user);
        return "test";
    }

}
