package com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni;

import com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.dao.InstructorDao;
import com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.entity.Instructor;
import com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAHibernateOneToOneUni {
    public static void main(String[] args) {
        SpringApplication.run(com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.JPAHibernateOneToOneUni.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(InstructorDao dao) {
        return runner -> {
//            createInstructor(dao);
//            findInstructor(dao);
            deleteInstructor(dao);
        };
    }


    private void createInstructor(InstructorDao dao) {
        Instructor instructor = new Instructor("Shweta", "Kumar", "sktest@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://youtube.com/gjjs68jhj", "Crazy coder");

        instructor.setInstructorDetail(instructorDetail);
        System.out.println("Instructor is being Saved..." + instructor);
        dao.save(instructor);
        System.out.println("Done...");

    }

    private void findInstructor(InstructorDao dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
        System.out.println("Get Instructor : " + instructor);
    }

    public void deleteInstructor(InstructorDao dao){
        int id =3 ;
        dao.deleteInstructorById(id);
        System.out.println("Instructor deleted.");

    }
}
