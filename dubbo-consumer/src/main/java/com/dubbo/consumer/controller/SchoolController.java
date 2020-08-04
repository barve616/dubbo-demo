package com.dubbo.consumer.controller;
import com.dubbo.service.SchoolService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SchoolController {
    //引用远程服务
    @DubboReference()
    private  SchoolService schoolService;
    @RequestMapping(value = "/school")
    public String school(){
        List<String> list = schoolService.school();
        String join = String.join(",", list);
        return join;
    }


}
