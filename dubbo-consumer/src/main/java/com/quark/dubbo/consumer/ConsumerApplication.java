package com.quark.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ZhenpengLu on 2018/4/9.
 */
@SpringBootApplication(scanBasePackages = "com.quark.dubbo.consumer.controller")
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
