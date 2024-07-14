package com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudEmployeeSpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudEmployeeSpringSecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
