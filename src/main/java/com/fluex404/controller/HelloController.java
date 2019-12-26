package com.fluex404.controller;

import com.fluex404.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String createIndex(){
        return "index";
    }
    @RequestMapping("/hello")
    public String redirect(Model model){

        model.addAttribute("emp", new Employee());

        return "viewpage";
    }
    @RequestMapping("/helloagain")
    public String display(@Valid @ModelAttribute("emp") Employee e, BindingResult br){
        if(br.hasErrors()) {
            return "viewpage";
        } else {
            return "final";
        }
    }
    @GetMapping("/hello1")
    public String getHello1(){
        return "hello1";
    }
    @GetMapping("/hello2")
    public String getHello2(){
        return "hello2";
    }
    @GetMapping("/hello3")
    public String getHello3(@RequestParam("name") String name,
            @RequestParam("password") String password,
                            Model model){ // HttpServletRequest req
        // read the provide form data
//        String name = req.getParameter("name");
//        String password = req.getParameter("password");

        if(password.equals("admin")) {
            String msg = "Hello " +name;

            model.addAttribute("msg", msg);

            return "viewpage";
        } else {
            String msg = "Sorry "+name+". Your entered an incorrect password";
            model.addAttribute("msg", msg);

            return "errorpage";
        }
    }
}
