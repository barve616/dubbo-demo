package com.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import com.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HelloController {

    @DubboReference(version = "${demo.service.version}")
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello()  {

        String hello = helloService.sayHello("99992299999999999999999999999999 ");
        System.out.println(helloService.sayHello("BJQ1111"));

        return hello;

    }
    @RequestMapping(value = "/student")
    public  String student(){
        String student = helloService.student("李四");
        return student;
    }

}
