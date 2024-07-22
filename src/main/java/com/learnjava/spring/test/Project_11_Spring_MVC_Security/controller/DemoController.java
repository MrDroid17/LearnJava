package com.learnjava.spring.test.Project_11_Spring_MVC_Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome() {

        return "mvc-security/home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){
        return "mvc-security/leaders";
    }

    @GetMapping("/systems")
    public String showSystem(){
        return "mvc-security/systems";
    }


}
