package com.example.springboot.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-06
 */
@Repository
public interface SysPermissionMapper {

    List<String> selectPermissionByUserId(@Param("userId") long userId);
}
