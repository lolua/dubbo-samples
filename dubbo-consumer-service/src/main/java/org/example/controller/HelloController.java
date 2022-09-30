package org.example.controller;

import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @DubboReference(cluster = ClusterRules.FAIL_SAFE)
    private HelloService helloService1;

    @GetMapping("hello")
    public String hello() {
        try {
            return helloService.hello();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("hello1")
    public String hello1() {
        try {
            return helloService1.hello();
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
