package com.learnjava.spring.test.Project_01_BasicSpring.config;

import com.learnjava.spring.test.Project_01_BasicSpring.components.SwimCoach;
import com.learnjava.spring.test.Project_01_BasicSpring.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
