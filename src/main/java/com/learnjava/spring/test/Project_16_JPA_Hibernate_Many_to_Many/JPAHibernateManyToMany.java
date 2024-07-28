package com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many;


import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.dao.AppDao;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Course;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAHibernateManyToMany {
    public static void main(String[] args) {
        SpringApplication.run(JPAHibernateManyToMany.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao dao) {
        return runner -> {

        };
    }


}
