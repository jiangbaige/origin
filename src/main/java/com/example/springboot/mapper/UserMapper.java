package com.example.springboot.mapper;

import com.example.springboot.base.BaseMapper;
import com.example.springboot.domain.pojo.User;
import com.github.pagehelper.Page;

import java.util.Map;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-04
 */
public interface UserMapper extends BaseMapper<User> {
    Page<User> getUsers(Map<String, Object> paramMap);
}
