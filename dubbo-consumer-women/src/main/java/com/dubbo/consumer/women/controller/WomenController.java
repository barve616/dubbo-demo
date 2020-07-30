package com.dubbo.consumer.women.controller;

import com.dubbo.service.WomenService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class WomenController {
//,retries = 50,
    @DubboReference(version = "${demo.service.version}")
    private WomenService womenService;

    @RequestMapping("/women")
    public String women()  {
        Date date =new Date();
        Timestamp timestamp=new Timestamp(date.getTime());


        String women = womenService.women("青年");
        System.out.println("consumer"+timestamp);
        return women;
    }

}
