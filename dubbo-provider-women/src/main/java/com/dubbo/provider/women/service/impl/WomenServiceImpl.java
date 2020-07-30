package com.dubbo.provider.women.service.impl;

import com.dubbo.service.WomenService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
//暴露服务
@DubboService(version = "${demo.service.version}",timeout = 6000)
public class WomenServiceImpl implements WomenService {
    @Override
    public String women(String name)  {

       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        Date date=new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        System.out.println("provider"+timestamp);
        return name;
    }
}
