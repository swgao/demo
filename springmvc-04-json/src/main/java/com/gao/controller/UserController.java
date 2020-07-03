package com.gao.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gao.pojo.User;
import com.gao.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {
    @RequestMapping("/j1")
//    @ResponseBody // 他就不会走视图解析器，直接找页面
    public String json() throws JsonProcessingException {
        // jackson
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("高世伟",20,"男");
        String string = mapper.writeValueAsString(user);
        return string;
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        // jackson
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("高世伟",20,"男");
        User user2 = new User("高世伟",20,"男");
        User user3 = new User("高世伟",20,"男");
        List<User> list= new ArrayList<User>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        String string = mapper.writeValueAsString(list);
        return string;
    }
    @RequestMapping("/j3")
    public String json3(){
        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }
}
