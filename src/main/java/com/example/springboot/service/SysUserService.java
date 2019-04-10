package com.example.springboot.service;

import com.example.springboot.domain.pojo.SysUser;
import com.example.springboot.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author sgl
 * @Date 2019-04-06
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
