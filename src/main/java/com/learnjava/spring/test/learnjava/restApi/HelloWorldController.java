package com.learnjava.spring.test.learnjava.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/test")
    public String testMessage(){
        return "This is a test method";
    }

    @GetMapping("/workout")
    public String runForHealth(){
        return "Running....";
    }
}
