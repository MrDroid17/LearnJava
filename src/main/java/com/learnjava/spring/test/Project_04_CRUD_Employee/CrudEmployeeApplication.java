package com.learnjava.spring.test.Project_04_CRUD_Employee;

import com.learnjava.spring.test.Project_03_RestCRUDApi.RestCrudApiApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudEmployeeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudEmployeeApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
