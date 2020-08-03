package com.enable.springsecurity.controller;

import com.enable.springsecurity.po.UserInfoPO;
import com.enable.springsecurity.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/7/27 15:48
 */

@Controller
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/index")
    public String index(){

        UserInfoPO userInfoPO = userInfoService.get("张三");
        return userInfoPO.getLoginId();
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/mylogin")
    public String login(){
        return "login";
    }
}
