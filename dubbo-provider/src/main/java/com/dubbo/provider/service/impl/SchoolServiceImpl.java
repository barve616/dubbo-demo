package com.dubbo.provider.service.impl;

import com.dubbo.service.SchoolService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
//@Service
@DubboService(loadbalance="roundrobin",weight=300)
//,weight=300
public class SchoolServiceImpl implements SchoolService {
    @Override
    public List<String> school() {
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        //我的权重是：300"
        System.out.println(list+"现在的时间是："+""+new Date() +"我是第3个provider，我的权重是：300");
        return list ;
    }
}
