package com.learnjava.spring.test.learnjava.config;

import com.learnjava.spring.test.learnjava.components.SwimCoach;
import com.learnjava.spring.test.learnjava.interfaces.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
