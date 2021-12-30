package com.jie.pojo;

import com.jie.pojo.UserService;
import org.springframework.stereotype.Component;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-09 22:20
 **/
@Component("userService")
public class UserServiceImp implements UserService {
    @Override
    public void login() {
        System.out.println("登陆成功");
    }
}
