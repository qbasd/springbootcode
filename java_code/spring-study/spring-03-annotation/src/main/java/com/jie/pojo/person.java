package com.jie.pojo;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-09 09:33
 **/
public class person {
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "person{" +
                "cat=" + cat +
                '}';
    }
}
