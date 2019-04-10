package com.example.springboot.service;

import com.example.springboot.mapper.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-06
 */
@Service
public class SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    public List<String> selectPermissionByUserId(long userId) {
        return sysPermissionMapper.selectPermissionByUserId(userId);
    }
}
