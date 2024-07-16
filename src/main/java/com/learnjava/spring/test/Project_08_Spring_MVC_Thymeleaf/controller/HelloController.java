package com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld_form";
    }
}
