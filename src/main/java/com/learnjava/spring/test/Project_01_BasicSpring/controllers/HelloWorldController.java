package com.learnjava.spring.test.Project_01_BasicSpring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    public HelloWorldController() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name: " + coachName + "\n Team Name : " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String testMessage() {
        return "This is a test method";
    }

}
