package com.jie.pojo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: spring-study
 * @description:注解实现的切面类
 * @author: MrXu
 * @create: 2021-11-09 23:31
 **/
@Aspect
@Component
public class register {
    @Before("execution(* com.jie.pojo.UserServiceImp.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* com.jie.pojo.UserServiceImp.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* com.jie.pojo.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //输出调用切入点方法信息
        System.out.println("签名" + joinPoint.getSignature());
        //执行方法过程
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
