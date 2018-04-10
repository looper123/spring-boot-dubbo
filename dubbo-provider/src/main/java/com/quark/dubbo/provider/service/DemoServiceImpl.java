package com.quark.dubbo.provider.service;


import com.quark.dubbo.api.DemoService;

/**
 * Created by zebon lu on 2017/5/15.
 * 服务提供者 提供的具体功能类
 */
//@Service(
//        version = "1.0.0",
//        application = "${consume.application.id}",
//        protocol = "${consume.protocol.id}",
//        registry = "${consume.registry.id}"
//)
public class DemoServiceImpl implements DemoService {


//    访问url测试   192.168.1.110:8080/sayHello?name='looper'
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
