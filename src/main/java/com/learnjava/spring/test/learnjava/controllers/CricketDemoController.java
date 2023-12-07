package com.learnjava.spring.test.learnjava.controllers;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketDemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public CricketDemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach
    ) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
        this.anotherCoach = theAnotherCoach;
    }


    @GetMapping("/daily/workout")
    private  String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    private String check(){
        return  "Comparing beans: myCoach == anotherCoach  " + (myCoach == anotherCoach);
    }


}
