package com.example.springboot.service;

import com.example.springboot.domain.pojo.User;
import com.example.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-04
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", "1");
        return userMapper.getUsers(paramMap);
    }
    @Cacheable(cacheNames = "users",key = "#id")
    public User selectById(long id){
        System.out.println("没有缓存，开始查询数据库...");
        //return userMapper.selectByPrimaryKey(id);
        return null;
    }

    @CacheEvict(value = "users" ,key = "#id")
    public void evictUser(long id) {
        System.out.println("evict user:" + id);
    }
}
