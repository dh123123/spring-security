package com.enable.springsecurity.service;

import com.enable.springsecurity.dao.UserInfoDAO;
import com.enable.springsecurity.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 14:17
 */
@Service
public class UserInfoService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public UserInfoPO get(String userName){

        UserInfoPO user = userInfoDAO.getUserByName(userName);

        return user;
    }
}
