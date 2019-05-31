package com.jklou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControl {

    @RequestMapping("logintest")
    public String LoginTest() {
        return "leihaoa";
    }
}
