package com.learnjava.spring.test.learnjava.components;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {
    public BaseballCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Home run daily.";
    }
}
