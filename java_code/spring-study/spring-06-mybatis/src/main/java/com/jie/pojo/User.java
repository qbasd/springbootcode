package com.jie.pojo;
import lombok.Data;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-10 09:22
 **/
@Data
public class User {
    private int id;
    private String name;
    private String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}
