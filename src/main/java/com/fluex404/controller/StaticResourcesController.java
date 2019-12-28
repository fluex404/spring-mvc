package com.fluex404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticResourcesController {
    @GetMapping("/getStatic")
    public String getStatic(){
        return "simple-static-resouces";
    }
}
