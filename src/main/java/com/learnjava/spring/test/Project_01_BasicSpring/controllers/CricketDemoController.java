package com.learnjava.spring.test.Project_01_BasicSpring.controllers;

import com.learnjava.spring.test.Project_01_BasicSpring.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketDemoController {
    private Coach myCoach;

    @Autowired
    public CricketDemoController(
            @Qualifier("swimCoach") Coach theCoach
    ) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
    }


    @GetMapping("/workout")
    private  String getDailyWorkout(){
        return myCoach.getDailyWorkout();

    }

}
