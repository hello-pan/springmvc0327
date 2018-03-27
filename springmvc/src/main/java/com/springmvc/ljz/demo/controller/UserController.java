package com.springmvc.ljz.demo.controller;

import com.springmvc.ljz.demo.model.User;
import com.springmvc.ljz.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/13.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
   UserService userService;

    @RequestMapping("/login")
    public String query(Model model){
       User user= userService.selectByPrimaryKey(1);
        model.addAttribute("user",user);
       return "loginUser";
    }



}
