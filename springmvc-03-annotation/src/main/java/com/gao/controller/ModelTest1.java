package com.gao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
//    @RequestMapping("/m1/t1")
//    public String test(HttpServletRequest request,HttpServletResponse response){
//        HttpSession session = request.getSession();
//        System.out.println(session.getId());
//        return "hello";
//    }
//@RequestMapping("/m1/t1")
//public String test(Model model){
//    // 转发
//    model.addAttribute("msg","ModelTest");
//    return "forward:/WEB-INF/jsp/hello.jsp";
//}
    @RequestMapping("/m1/t1")
    public String test(Model model){
        // 重定向
        model.addAttribute("msg","ModelTest");
        return "redirect:/index.jsp";
    }
}
