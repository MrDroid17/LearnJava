package com.learnjava.spring.test.Project_01_BasicSpring.components;

import com.learnjava.spring.test.Project_01_BasicSpring.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice daily 15 min of fast bowling :-)";
    }
}
