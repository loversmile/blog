package com.jklou.bean;

import java.util.Date;

public class UserLogin {
    private String user_id;

    private String session;

    private Date login_time;

    private String login_timestamp;

    private int login_timeout;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public String getLogin_timestamp() {
        return login_timestamp;
    }

    public void setLogin_timestamp(String login_timestamp) {
        this.login_timestamp = login_timestamp;
    }

    public int getLogin_timeout() {
        return login_timeout;
    }

    public void setLogin_timeout(int login_timeout) {
        this.login_timeout = login_timeout;
    }
}
