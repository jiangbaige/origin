package com.example.springboot.controller;

import com.example.springboot.domain.pojo.User;
import com.example.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-04
 */
@RestController
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/users")
    public @ResponseBody PageInfo<User> lists(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(userservice.getUsers());
        return pageInfo;
    }
    @GetMapping("/users/{id}")
    public @ResponseBody User selectUserById(@PathVariable("id") Long id, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        return userservice.selectById(id);
    }

    @GetMapping("/users/del/{id}")
    public String delUser(@PathVariable("id") Long id , HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        userservice.evictUser(id);
        return "删除成功";
    }
}
