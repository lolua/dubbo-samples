package org.example;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class DubboConsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerServiceApplication.class, args);
    }

}
