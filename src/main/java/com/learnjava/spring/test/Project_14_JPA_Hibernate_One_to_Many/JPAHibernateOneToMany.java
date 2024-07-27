package com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many;

import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.dao.InstructorDao;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.Instructor;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAHibernateOneToMany {
    public static void main(String[] args) {
        SpringApplication.run(JPAHibernateOneToMany.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(InstructorDao dao) {
        return runner -> {
//            createInstructor(dao);
//            findInstructor(dao);
//            deleteInstructor(dao);
//            findInstructorDetail(dao);
            deleteInstructorDetail(dao);
        };
    }



    private void createInstructor(InstructorDao dao) {
        InstructorDetail instructorDetail = new InstructorDetail("http://youtube.com/gjjs68jhj", "Cute coder");
        InstructorDetail instructorDetail2 = new InstructorDetail("http://youtube.com/gjjs6jhj", "Crazy coder");
        InstructorDetail instructorDetail3 = new InstructorDetail("http://youtube.com/gjjs68jhj", "Dangerous coder");

        Instructor instructor = new Instructor("Shweta", "Kumar", "shwetatest@gmail.com");
        Instructor instructor2 = new Instructor("sobhit", "Kumar", "sktest@gmail.com");
        Instructor instructor3 = new Instructor("Rohan", "malik", "rmalik@gmail.com");

        instructor.setInstructorDetail(instructorDetail);
        instructor2.setInstructorDetail(instructorDetail2);
        instructor3.setInstructorDetail(instructorDetail3);

        System.out.println("Instructor is being Saved..." + instructor);

        dao.save(instructor);
        dao.save(instructor2);
        dao.save(instructor3);

        System.out.println("Done...");

    }

    private void findInstructor(InstructorDao dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
        System.out.println("Get Instructor : " + instructor);
    }

    public void deleteInstructor(InstructorDao dao){
        int id =3;
        dao.deleteInstructorById(id);
        System.out.println("Instructor deleted.");

    }

    private void findInstructorDetail(InstructorDao dao) {
        int id =3;
        InstructorDetail instructorDetail = dao.findInstructorDetailsById(id);
        System.out.println("Instructor Detail" +  instructorDetail);
        System.out.println("Instructor" +  instructorDetail.getInstructor());
    }

    private void deleteInstructorDetail(InstructorDao dao) {
        int id =2;
        System.out.println("Deleting instructor detail id : " + id);

        dao.deleteInstructorDetail(id);
        System.out.println("Instructor Detail deleted.");

    }

}
