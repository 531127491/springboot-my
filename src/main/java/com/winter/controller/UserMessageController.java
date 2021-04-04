package com.winter.controller;

import com.winter.model.User;
import com.winter.model.UserMessage;
import com.winter.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userMessage")
public class UserMessageController {
    @Autowired
    private UserMessageService userMessageService;

    @RequestMapping("findMsgByAccound/{account}")
    @ResponseBody
    public UserMessage findMsgByAccound(@PathVariable String account) {
//        return "宝宝,我爱你!";
        UserMessage userMessage = userMessageService.selectByPrimaryKey( account );
        return userMessage;
    }
}
