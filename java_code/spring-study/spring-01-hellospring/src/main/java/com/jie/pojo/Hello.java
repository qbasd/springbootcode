package com.jie.pojo;

/**
 * @program: spring-study
 * @description: 实体类
 * @author: MrXu
 * @create: 2021-11-05 20:31
 **/
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
