package com.learnjava.spring.test.Project_10_Spring_MVC_CRUD;

import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.CrudEmployeeSpringDataJPAApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMVCDatabaseCRUD {
    public static void main(String[] args) {
        SpringApplication.run(SpringMVCDatabaseCRUD.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
