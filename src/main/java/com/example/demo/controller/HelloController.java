package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    public String hello(){
        return "hello spring boot \n 谢谢阅读!";
    }
}
