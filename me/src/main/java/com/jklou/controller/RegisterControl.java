package com.jklou.controller;

import com.jklou.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterControl {

    @RequestMapping("registertest")
    public String RegisterTest() {
        return "welcome register";
    }

    @RequestMapping("user")
    public User getUser() {
        return new User("jklou", "heeeeeeee");
    }
}
