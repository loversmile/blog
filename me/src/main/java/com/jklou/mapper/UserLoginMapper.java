package com.jklou.mapper;

import com.jklou.bean.UserLogin;

public interface UserLoginMapper {
    int updateSessionById(UserLogin userLogin);
}
