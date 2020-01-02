package com.fluex404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;

@Controller
public class RequestMappingController {
    @GetMapping(value = {"/request1","/request2"})
            //produces = {"application/json","application/xml"},
            //consumes="text/html") //headers = "name=isa"

    @ResponseBody
    public ModelMap getRequest(){
        ModelMap m = new ModelMap();

        m.put("data", "ini datanya");


        return m;
    }
}
