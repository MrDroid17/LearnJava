package com.learnjava.spring.test.learnjava.components;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K";
    }
}
