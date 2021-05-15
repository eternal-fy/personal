package com.ld.controller;

import com.ld.pojo.User;
import com.ld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
    @Autowired
    UserService userService;

    @RequestMapping("/hehe")
    public String con1(int id){
        System.out.println("-------");
        System.out.println(id);

        User user = userService.getUser(id);
        System.out.println(user);

      return "welcome.html";

    }
}
