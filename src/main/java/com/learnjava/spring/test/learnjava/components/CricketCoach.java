package com.learnjava.spring.test.learnjava.components;

import com.learnjava.spring.test.learnjava.interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @PostConstruct   // for init bean
    public void doTheStuffMethod(){
        System.out.println("Inside doTheStuffMethod:  " + this.getClass().getSimpleName());
    }
    @PreDestroy // for destroying bean
    public void doTheCleaningStuff(){
        System.out.println("Inside doTheCleaningStuff:  " + this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice daily 15 min of fast bowling :-)";
    }
}
