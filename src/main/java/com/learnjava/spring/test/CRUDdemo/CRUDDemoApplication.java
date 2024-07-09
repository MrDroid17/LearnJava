package com.learnjava.spring.test.CRUDdemo;

import com.learnjava.spring.test.CRUDdemo.DAO.StudentDAO;
import com.learnjava.spring.test.CRUDdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CRUDDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRUDDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDao){
        return runner -> {
            createStudent(studentDao);
        };
    }

    private void createStudent(StudentDAO studentDao) {
        System.out.println("Creating Student");
        Student tempStudent = new Student("Sobhit", "Kumar", "sobhit2010@gmail.com");
        Student tempStudent2 = new Student("Sobhit", "Kumar", "sobhit2010@gmail.com");
        Student tempStudent3 = new Student("Sobhit", "Kumar", "sobhit2010@gmail.com");

        System.out.println("Saving Student");
        studentDao.save(tempStudent);
        studentDao.save(tempStudent2);
        studentDao.save(tempStudent3);

        System.out.println("Get saved Student id: "+ tempStudent.getId());
        System.out.println("Get saved Student id: "+ tempStudent2.getId());
        System.out.println("Get saved Student id: "+ tempStudent3.getId());
    }
}
