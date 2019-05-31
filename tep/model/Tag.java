package com.jklou.model;

import lombok.Data;

@Data
public class Tag {
    private int id;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签大小
     */
    private int tagSize;

    public Tag() {
    }

    public Tag(String tagName, int tagSize) {
        this.tagName = tagName;
        this.tagSize = tagSize;
    }
}
