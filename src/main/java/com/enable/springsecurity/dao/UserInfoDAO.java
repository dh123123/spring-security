package com.enable.springsecurity.dao;

import com.enable.springsecurity.po.UserInfoPO;
import org.jboss.logging.Param;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 13:14
 */
public interface UserInfoDAO {

    public UserInfoPO getUserByName(String userName);
}
