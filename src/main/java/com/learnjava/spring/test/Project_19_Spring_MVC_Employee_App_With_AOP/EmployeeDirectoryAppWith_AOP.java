package com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeDirectoryAppWith_AOP {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeDirectoryAppWith_AOP.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
