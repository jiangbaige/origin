package com.example.demo.controller;
import com.example.demo.model.RandomData;
import com.example.demo.model.TestEntity;
import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-04
 */
@RestController
public class ModelController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModelController.class);

    /**
     * 注入User
     */
    @Autowired
    private User user;

    @GetMapping("/say")
    public String hello() {
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");
        return "名字"+user.getName()+"年龄"+user.getAge()+"岁，地址："+user.getAddress();
    }

    @Autowired
    private RandomData randomdata;

    @GetMapping("/random")
    public RandomData random() {
        return randomdata;
    }

    @Autowired
    private TestEntity testEntity;

    @GetMapping("/test")
    public TestEntity getTestEntity() {
        return testEntity;
    }




}
