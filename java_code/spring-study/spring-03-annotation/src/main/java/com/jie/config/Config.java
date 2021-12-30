package com.jie.config;

import com.jie.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-study
 * @description:
 * @author: MrXu
 * @create: 2021-11-09 08:51
 **/
@Configuration
public class Config {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
