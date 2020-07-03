package com.gao.controller;

import com.gao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        // 接受前端的参数
        System.out.println(name);
        // 将得到的参数传递给前端
        model.addAttribute("msg",name);
        return "hello";
    }

    // 接受的是一个对象
    @GetMapping("/t2")
    public String tset2(User user){
        System.out.println(user);
        return "hello";
    }
}
