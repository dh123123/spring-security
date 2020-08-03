package com.enable.springsecurity.po;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 13:11
 */
@Data
public class UserInfoPO {

    private String userId;

    private String userName;

    private String loginId;

    private String passWord;

    private Date creatTime;

    private String creator;

    private Date updateTime;

    private String updator;
}
