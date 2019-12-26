package com.fluex404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String createIndex(){
        return "index";
    }
    @RequestMapping("/hello")
    public String redirect(){
        return "viewpage";
    }
    @RequestMapping("/helloagain")
    public String display(){
        return "final";
    }
    @GetMapping("/hello1")
    public String getHello1(){
        return "hello1";
    }
    @GetMapping("/hello2")
    public String getHello2(){
        return "hello2";
    }
}
