package com.learnjava.spring.test.learnjava.components;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice daily 15 min of fast bowling";
    }
}
