package com.example.springboot.controller;

import com.example.springboot.domain.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 由Spring根据ConfigurationProperties自动注入属性的值
 * @Author
 * @Date 2019-04-06
 */
@Controller
public class IndexController {
    /**
     * 首页，并将登录用户的全名返回前台
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) {
        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName", sysUser.getFullName());
        return "index";
    }

//    @GetMapping("/index")
//    public ModelAndView index()
//    {
//        ModelAndView view = new ModelAndView("index");
//        view.addObject("userName","baige");
//        return view;
//    }
}
