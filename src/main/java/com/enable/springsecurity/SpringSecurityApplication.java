package com.enable.springsecurity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Jack_Dong@enable-ets.com
 * @Date: 2020/8/3 11:04
 */

@MapperScan(basePackages = "com.enable.springsecurity.dao")
@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringSecurityApplication.class);
    }

}
