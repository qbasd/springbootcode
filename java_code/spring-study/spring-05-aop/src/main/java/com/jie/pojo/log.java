package com.jie.pojo;

import org.aopalliance.intercept.Joinpoint;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: spring-study
 * @description: 切面类
 * @author: MrXu
 * @create: 2021-11-09 22:22
 **/
@Component("log")
public class log implements MethodBeforeAdvice {
    //添加日志功能，o是核心业务-即目标类，即被代理对象，method为切入点处的方法
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
