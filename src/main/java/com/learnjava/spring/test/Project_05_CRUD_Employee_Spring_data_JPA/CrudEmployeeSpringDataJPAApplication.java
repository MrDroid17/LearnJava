package com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudEmployeeSpringDataJPAApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudEmployeeSpringDataJPAApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
