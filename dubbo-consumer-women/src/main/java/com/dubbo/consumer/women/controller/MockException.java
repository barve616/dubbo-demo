package com.dubbo.consumer.women.controller;

import com.dubbo.service.WomenService;

/**
 * 熔断处理，超时
 */
public class MockException implements WomenService {
    @Override
    public String women(String name)  {
        return "容错数据";
    }
}
