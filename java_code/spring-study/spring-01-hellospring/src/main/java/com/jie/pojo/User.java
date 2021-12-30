package com.jie.pojo;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-06 14:25
 **/
public class User {
    private String name;

    public User() {
        System.out.println("无参构造器被创建了！");
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
