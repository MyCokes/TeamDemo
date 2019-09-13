package com.team.demo.boot_01.controller;

import com.team.demo.boot_01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public Object getUser() {
        System.out.println("C -->");
        return userService.getAllUser();
    }

    @GetMapping("/update")
    public Object update(){
     return userService.updateUser();
    }


}
