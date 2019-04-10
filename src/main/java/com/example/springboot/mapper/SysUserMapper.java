package com.example.springboot.mapper;

import com.example.springboot.domain.pojo.SysUser;

/**
 * @Description
 * @Author sgl
 * @Date 2019-04-06
 */
public interface SysUserMapper {

    SysUser findByUserName(String userName);

}
