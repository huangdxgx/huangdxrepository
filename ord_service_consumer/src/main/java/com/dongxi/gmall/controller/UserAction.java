package com.dongxi.gmall.controller;

import com.dongxi.gmall.bean.User;
import com.dongxi.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class UserAction {

    @Autowired
    private UserService userService;

    public String index(Model model){
        List<User> userList = userService.getUserAddressList();
        model.addAttribute("userList",userList);
        return "user";
    }



}
