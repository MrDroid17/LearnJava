package com.learnjava.spring.test.learnjava.controllers;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketDemoController {
    private Coach myCoach;

    @Autowired
    public CricketDemoController(@Qualifier("baseballCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }


    @GetMapping("/daily/workout")
    private  String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


}
