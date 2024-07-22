package com.learnjava.spring.test.Project_11_Spring_MVC_Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showMyLoginPage() {

        return "mvc-security/login";
    }

}
