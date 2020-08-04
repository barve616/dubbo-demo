package com.dubbo.provider;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

//开启dubbo的自动配置
@EnableAutoConfiguration
//@EnableDubbo
//@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderApplication.class).run(args);
    }

}
