package com.jklou.model;

import lombok.Data;

import java.util.List;

/**
 * @author: jklou
 * @Date: 2018/12/06 11:49
 * Describe: 用户实体类
 */
@Data
public class User {
    private int id;

    /*Phone number*/
    private String phone;

    private String username;

    private String password;

    private String gender;

    private String trueName;

    private String birthday;

    private String personalBrief;

    private String email;

    /**
     * 最后登录时间
     */
    private String recentlyLanded;

    /**
     * 头像地址
     */
    private String avatarImgUrl;

    private List<Role> roles;

    public User() {
    }

    public User(String phone, String username, String password, String gender) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public User(String phone, String username, String password, String gender, String trueName, String birthday, String personalBrief, String email, String recentlyLanded, String avatarImgUrl) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.trueName = trueName;
        this.birthday = birthday;
        this.personalBrief = personalBrief;
        this.email = email;
        this.recentlyLanded = recentlyLanded;
        this.avatarImgUrl = avatarImgUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
