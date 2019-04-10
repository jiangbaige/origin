package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-04
 */
@ConfigurationProperties("test")
@Component
@PropertySource("classpath:test.properties")
public class TestEntity {

    private String name;
    private Integer num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
