package com.dev.wiki.domain;

/**
 * 表的实体类
 * 类名与表名一致
 */

public class Test {
    private Integer id;
    private String name;
    private String password;

    // getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
