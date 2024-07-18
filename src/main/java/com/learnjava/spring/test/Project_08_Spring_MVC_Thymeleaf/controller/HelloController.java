package com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld_form";
    }

    @RequestMapping("/processForm")
    public String processedForm(){
        return "helloworld_processed";
    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(HttpServletRequest request, Model model){
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo " + name;
        model.addAttribute("message", result);

        return "helloworld_processed";
    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model){
        name = name.toUpperCase();
        String result = "hey My friend from V3! " + name;
        model.addAttribute("message", result);

        return "helloworld_processed";
    }


}
