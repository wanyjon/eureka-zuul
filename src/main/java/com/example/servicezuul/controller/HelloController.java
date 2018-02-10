package com.example.servicezuul.controller;

import com.example.servicezuul.bean.SysRole;
import com.example.servicezuul.bean.SysUser;
import com.example.servicezuul.dao.SysUserRepository;
import com.example.servicezuul.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private SysUserRepository sysUserRepository;

    @RequestMapping(value = { "/", "/welcome" })
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("info");
        return model;

    }

    @RequestMapping(value = "/admin")
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page - Admin Page!");
        model.setViewName("admin");

        return model;

    }

    @RequestMapping(value = "/dba")
    public ModelAndView dbaPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page - Database Page!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping("test")
    public void test() {
        System.out.println("test is running");
        List<SysRole> list = new ArrayList<SysRole>();
        SysRole sysRole = new SysRole();
        sysRole.setName("USER");
        list.add(sysRole);
        SysUser sysUser = new SysUser();
        sysUser.setUsername("jon");
        sysUser.setPassword("6666");
        sysUser.setRoles(list);
        sysUserRepository.save(sysUser);
    }
}
