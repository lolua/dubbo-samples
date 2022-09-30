package org.example.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.HelloService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "Hello World!!!";
    }
}
