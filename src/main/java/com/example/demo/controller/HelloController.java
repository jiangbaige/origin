package com.example.demo.controller;

import com.example.demo.manager.StringManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 通过@Value使用自定义属性
 * @Author sgl
 * @Date 2018-04-27 14:41
 */
@RestController
public class HelloController {

    @Autowired
    private StringManager stringManager;

    @Resource
    private StringManager stringManagerA;

    /**
     *
     * 通过${}获取application.properties里的自定义属性
     */
    @Value("${pocket.name}")
    private String name;

    @Value("${pocket.age}")
    private Integer age;

    @Value("${pocket.address}")
    private String address;

    @GetMapping("/hello")
    public String hello() {
        return "名字:" + name +"年龄：" + age + "地址："+address;
    }

}
