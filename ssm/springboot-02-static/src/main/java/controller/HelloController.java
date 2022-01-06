package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-02-static
 * @description:
 * @author: MrXu
 * @create: 2022-01-06 21:15
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello,word!";
    }
}
