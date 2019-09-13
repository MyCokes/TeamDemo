package com.team.demo.boot_01.controller;

import com.springboot.mybatis.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/REST")
public class RESTFullController {

    @RequestMapping("/user/{id}")
    public Object user(@PathVariable("id") Integer id){
        User user = new User();
        user.setUserId(id.toString());
        user.setUserName("张三风");
        return user;
    }




}
