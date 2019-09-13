package com.team.demo.boot_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody
    String hello() {
        System.out.println("666666666666666666666");
        return "Hello world";
    }

}
