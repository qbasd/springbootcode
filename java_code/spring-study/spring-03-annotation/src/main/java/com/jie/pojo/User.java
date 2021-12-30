package com.jie.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-08 22:47
 **/
@Component("user")
public class User {
    @Value("jie")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
