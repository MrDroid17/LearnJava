package com.learnjava.spring.test.Project_01_BasicSpring.components;

import com.learnjava.spring.test.Project_01_BasicSpring.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise goal daily.";
    }
}
