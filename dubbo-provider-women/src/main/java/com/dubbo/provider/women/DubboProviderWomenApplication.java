package com.dubbo.provider.women;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
@EnableAutoConfiguration
public class DubboProviderWomenApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderWomenApplication.class).run(args);
    }
}
