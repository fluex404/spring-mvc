package com.fluex404.controller;

import com.fluex404.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {
    @RequestMapping("/helloworld")
    public String getHelloWorld(Model model) {
        HelloWorld h = new HelloWorld();
        h.setMessage("Hello World Example Uing Spring MVC 5!");
        h.setDateTime(LocalDateTime.now().toString());

        model.addAttribute("helloWorld", h);
        return "helloworld";
    }
}
