package com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAHibernateAdvancedMapping {
    public static void main(String[] args){
        SpringApplication.run(JPAHibernateAdvancedMapping.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(String[] args){
        return runner ->{
            System.out.println("JPA Hibernate Advanced Mapping");
        };
    }
}
