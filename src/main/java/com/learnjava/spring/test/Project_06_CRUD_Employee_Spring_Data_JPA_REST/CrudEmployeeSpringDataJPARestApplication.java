package com.learnjava.spring.test.Project_06_CRUD_Employee_Spring_Data_JPA_REST;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudEmployeeSpringDataJPARestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudEmployeeSpringDataJPARestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
