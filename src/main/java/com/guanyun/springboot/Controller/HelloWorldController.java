package com.guanyun.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController class
 *
 * @description: springboot-helloworld 实例
 * @author: hef
 * @date 2018/11/29 0029
 * @time 10:01
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHelloWorld(){
        return "Hello World!";
    }
}
