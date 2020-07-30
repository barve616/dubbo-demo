package com.dubbo.provider.service.impl;

import com.dubbo.service.SchoolService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//@Service
@DubboService
public class SchoolServiceImpl implements SchoolService {
    @Override
    public List<String> school() {
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        return list ;
    }
}
