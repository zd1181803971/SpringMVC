package com.dzu.controller;

import com.alibaba.fastjson.JSON;
import com.dzu.pojo.User;
import com.dzu.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController//@RestController表示这个controller下面的所有方法都不走视图解析器 ，都会返回字符串

public class UserController {

    @RequestMapping("/j1")
    // @ResponseBody//加了这个注解，这个方法就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("赵董1",3,"男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();
        User user = new User("赵董1",3,"男");
        User user2 = new User("赵董2",3,"男");
        User user3 = new User("赵董3",3,"男");
        User user4 = new User("赵董4",3,"男");
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return new ObjectMapper().writeValueAsString(userList);
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        //ObjectMapper,时间解析后的默认格式为： Timestamp

        return new ObjectMapper().writeValueAsString(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }
    @RequestMapping("/j4")
    public String json4()  {
        Date date = new Date();

        return JsonUtils.getJson(date);


    }

    @RequestMapping("/j5")
    public String json5()  {
        List<User> userList = new ArrayList<User>();
        User user = new User("赵董1",3,"男");
        User user2 = new User("赵董2",3,"男");
        User user3 = new User("赵董3",3,"男");
        User user4 = new User("赵董4",3,"男");
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        String jsonString = JSON.toJSONString(userList);
        return jsonString;
    }
}
