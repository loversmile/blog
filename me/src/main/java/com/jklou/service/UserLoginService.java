package com.jklou.service;

import com.jklou.bean.UserLogin;
import com.jklou.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    @Autowired
    private UserLoginMapper userLoginMapper;

    public int updateSession(UserLogin userLogin) {
        return userLoginMapper.updateSessionById(userLogin);
    }
}
