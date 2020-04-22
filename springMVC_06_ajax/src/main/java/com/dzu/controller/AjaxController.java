package com.dzu.controller;

import com.dzu.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.interfaces.PBEKey;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/a")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if("zd".equals(name)){
            response.getWriter().println("yes");
        }else {
            response.getWriter().println("no");
        }
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("zd",10,"男"));
        userList.add(new User("zd2",10,"男"));
        userList.add(new User("zd3",120,"男"));
        return userList;
    }
    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if(name != null){
            if("admin".equals(name)){
                msg = "ok";
            }else {
                msg = "name no ";
            }
        }
        if(pwd != null){
            if("123456".equals(pwd)){
                msg = "ok";
            }else {
                msg = "pwd no ";
            }
        }
        return msg;
    }
}
