package com.fluex404.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@PropertySource("classpath:application.properties")
public class HelloRestController {
    @Value("${data.name}")
    String data;

    @GetMapping
    public ModelMap getHello(){
        ModelMap m = new ModelMap();

        m.put("message", "success");
        m.put("status", 200);
        m.put("data", data);

        return m;
    }
}
