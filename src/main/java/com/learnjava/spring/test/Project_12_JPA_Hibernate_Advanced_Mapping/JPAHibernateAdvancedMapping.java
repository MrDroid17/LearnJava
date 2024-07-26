package com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping;

import com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping.dao.InstructorDao;
import com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping.entity.Instructor;
import com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping.entity.InstructorDetail;
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
    public CommandLineRunner commandLineRunner(InstructorDao dao){
        return runner -> {
            createInstructor(dao);
        };
    }

    private void createInstructor(InstructorDao dao) {
        Instructor instructor = new Instructor();
        InstructorDetail instructorDetail = new InstructorDetail();

        instructor.setInstructorDetail(instructorDetail);
        System.out.println("Instructor is being Saved..." + instructor);
        dao.save(instructor);

    }
}
