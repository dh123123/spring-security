package com.enable.springsecurity.service;

import com.enable.springsecurity.dao.UserInfoDAO;
import com.enable.springsecurity.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 10:46
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        UserInfoPO user = userInfoDAO.getUserByName(userName);

        if (user==null){
            throw  new UsernameNotFoundException(userName);
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();


        return new User(user.getUserName(),user.getPassWord(),authorities);
    }

}
