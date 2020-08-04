package com.dubbo.provider.service.impl;

import com.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//dubbo注解，暴露服务
@DubboService(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String sayHello(String name) {
        System.out.println(name);
        
        return "Hello" + serviceName;
    }

    @Override
    public String student(String name) {
        return name;
    }
}
