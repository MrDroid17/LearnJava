package com.learnjava.spring.test.Project_01_BasicSpring.components;

import com.learnjava.spring.test.Project_01_BasicSpring.interfaces.Coach;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 500 meter as warm up.";
    }
}
