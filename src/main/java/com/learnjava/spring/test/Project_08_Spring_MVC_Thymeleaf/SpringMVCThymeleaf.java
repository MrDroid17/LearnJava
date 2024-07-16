package com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf;

import com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.CrudEmployeeSpringSecurityApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMVCThymeleaf {
    public static void main(String[] args) {
        SpringApplication.run(SpringMVCThymeleaf.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner -> {
            System.out.println("Hello World");
        };
    }
}
