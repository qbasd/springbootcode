package com.jie.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-08 22:29
 **/

public class Dog {
    @Value("hua")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    public void shout(){
        System.out.println("wangwang!");
    }
}
