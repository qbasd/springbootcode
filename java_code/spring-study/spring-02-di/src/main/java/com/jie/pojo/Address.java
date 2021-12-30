package com.jie.pojo;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-06 16:17
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
