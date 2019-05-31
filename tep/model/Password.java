package com.jklou.model;

import lombok.Data;

@Data
public class Password {
    private int id;

    private String password;

    private String username;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
