package com.fluex404.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloRestController {
    @GetMapping
    public ModelMap getHello(){
        ModelMap m = new ModelMap();
        Object data = "ini datanya";

        m.put("message", "success");
        m.put("status", 200);
        m.put("data", data);

        return m;
    }
}
