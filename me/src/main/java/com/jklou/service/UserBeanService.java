package com.jklou.service;

import com.jklou.bean.UserBean;
import com.jklou.mapper.UserBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBeanService {
    @Autowired
    private UserBeanMapper userBeanMapper;

    public List<UserBean> listUsers(){
        List<UserBean> list = new ArrayList<UserBean>();
        list = userBeanMapper.listAll();
        return list;
    }
}
