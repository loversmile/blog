package com.jklou.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jklou.service.UserLoginService;
import com.jklou.bean.UserLogin;

@RestController
@RequestMapping("/login")
@MapperScan("com.jklou.mapper")
public class UserLoginControl {
    @Autowired
    private UserLoginService service;

    @RequestMapping("/updateSession")
    public int updateSession(@RequestParam("id") String id, @RequestParam("session") String session, @RequestParam("login_timestamp") String login_timestamp){
        // System.out.println(userLogin);
        UserLogin userLogin = new UserLogin();
        userLogin.setUser_id(id);
        userLogin.setLogin_timestamp(login_timestamp);
        userLogin.setSession(session);

        System.out.println(userLogin.getUser_id());
        System.out.println(userLogin.getLogin_timestamp());
        System.out.println(userLogin.getSession());
        System.out.println(userLogin.getLogin_time());
        System.out.println(userLogin.getLogin_timeout());
        return service.updateSession(userLogin);
    }
    @RequestMapping("/test")
    public String loginTest(){
        return "jhjjajja";
    }
}
