package com.jklou.model;

import lombok.Data;

/**
 * @author: jklou
 * @Date: 2018/12/06 19:41
 * Describe: 权限
 */
@Data
public class Role {
    private int id;

    private String name;

    public Role(){

    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
