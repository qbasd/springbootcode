package com.jie.pojo;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-08 22:31
 **/
public class Cat {
    private String name;

    public void shout(){
        System.out.println("miao!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
