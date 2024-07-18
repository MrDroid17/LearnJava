package com.learnjava.spring.test.Project_09_Spring_MVC_Validation;

import com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf.SpringMVCThymeleaf;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMVCThymeleafValidation {
    public static void main(String[] args) {
        SpringApplication.run(SpringMVCThymeleafValidation.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
