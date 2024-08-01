package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl implements  TrafficFortuneService{
    @Override
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Expect Heavy traffic this morning";
    }

    @Override
    public String getFortune(boolean tripWire) {
        if(tripWire){
            throw new RuntimeException("Major Accident Ahead.... No Good News.");
        }

        return getFortune();
    }
}
