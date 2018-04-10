package com.quark.dubbo.consumer.controller;

import com.quark.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/28/028.
 */
@RestController
public class DemoConsumerController {

//    @Reference(version = "1.0.0",
//            application = "${consume.application.id}",
//            url = "consume://localhost:20800")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
