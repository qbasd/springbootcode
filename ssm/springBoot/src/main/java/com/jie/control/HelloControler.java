package com.jie.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springBoot-01-helloword
 * @description:
 * @author: MrXu
 * @create: 2021-12-28 19:26
 **/
@Controller
@RequestMapping("/helloSpringboot")
public class HelloControler {
    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "hello";
    }
}
