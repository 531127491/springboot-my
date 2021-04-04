package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findPwdByAccound/{account}")
    @ResponseBody
    public User selectByPrimaryKey(@PathVariable String account) {
        User user = userService.selectByPrimaryKey( account );
        return user;
    }

    @RequestMapping("findMsgByAccound/{account}")
    @ResponseBody
    public User findMsgByAccound(@PathVariable String account) {
        User user = userService.selectByPrimaryKey( account );
        return user;
    }
}
