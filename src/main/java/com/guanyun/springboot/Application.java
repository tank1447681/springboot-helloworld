package com.guanyun.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application class
 *
 * @description: springboot启动类
 * @author: hef
 * @date 2018/11/29 0029
 * @time 9:59
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        //程序启动入口
        //启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
        SpringApplication.run(Application.class,args);
    }

}
