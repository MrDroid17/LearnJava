package com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni;

import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.dao.AppDao;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.Course;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.Instructor;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JPAHibernateOneToManyUni {
    public static void main(String[] args) {
        SpringApplication.run(JPAHibernateOneToManyUni.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao dao) {
        return runner -> {
//            createInstructor(dao);
//            findInstructor(dao);
//            deleteInstructor(dao);
//            findInstructorDetail(dao);
//            deleteInstructorDetail(dao);
//            createInstructorWithCourses(dao);
//            findInstructorWithCourses(dao);
//            findCoursesForInstructor(dao);
//            findInstructorWithCoursesJoinFetch(dao);
//            updateInstructor(dao);
//            updateCourse(dao);
//            deleteCourse(dao);

        };
    }

    private void deleteCourse(AppDao dao) {
        int id = 10;
        dao.deleteCourseById(id);
        System.out.println("Done! " + "Deleted Course Id " + id);
    }


    private void updateInstructor(AppDao dao) {
        int id =1;
        Instructor instructor = dao.findInstructorById(id);
        instructor.setLastName("Tester");
        dao.updateCourse(instructor);
        System.out.println("Done !");
    }


    private void createInstructor(AppDao dao) {
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

    private void findInstructor(AppDao dao) {
        int id = 1;
        Instructor instructor = dao.findInstructorById(id);
        System.out.println("Get Instructor : " + instructor);
    }

    public void deleteInstructor(AppDao dao){
        int id =1;
        dao.deleteInstructorById(id);
        System.out.println("Instructor deleted.");

    }

    private void findInstructorDetail(AppDao dao) {
        int id =3;
        InstructorDetail instructorDetail = dao.findInstructorDetailsById(id);
        System.out.println("Instructor Detail" +  instructorDetail);
        System.out.println("Instructor" +  instructorDetail.getInstructor());
    }

    private void deleteInstructorDetail(AppDao dao) {
        int id =2;
        System.out.println("Deleting instructor detail id : " + id);

        dao.deleteInstructorDetail(id);
        System.out.println("Instructor Detail deleted.");

    }

    private void createInstructorWithCourses(AppDao dao) {
        InstructorDetail instructorDetail = new InstructorDetail("http://youtube.com/gjjs68jhj", "Cute coder");
        InstructorDetail instructorDetail2 = new InstructorDetail("http://youtube.com/gjjs6jhj", "Crazy coder");
        InstructorDetail instructorDetail3 = new InstructorDetail("http://youtube.com/gjjs68jhj", "Dangerous coder");

        Instructor instructor = new Instructor("Shweta", "Kumar", "shwetatest@gmail.com");
        Instructor instructor2 = new Instructor("sobhit", "Kumar", "sktest@gmail.com");
        Instructor instructor3 = new Instructor("Rohan", "malik", "rmalik@gmail.com");

        instructor.setInstructorDetail(instructorDetail);
        instructor2.setInstructorDetail(instructorDetail2);
        instructor3.setInstructorDetail(instructorDetail3);


        Course course = new Course("Java Masterclass");
        Course course2 = new Course("Ultimate angular Guide");
        Course course3 = new Course("Complete MERN Stack");

        instructor.add(course);
        instructor2.add(course2);
        instructor3.add(course3);

        System.out.println("Instructor is being Saved..." + instructor);

        dao.save(instructor);
        dao.save(instructor2);
        dao.save(instructor3);

        System.out.println("Done...");
    }

    private void findInstructorWithCourses(AppDao dao) {
        int id =1;
        System.out.println("Finding instructor id: " + id);

        Instructor instructor = dao.findInstructorById(id);
        System.out.println(" instructor : " + instructor);
        System.out.println(" Associated courses  : " + instructor.getCourses());
        System.out.println(" Done " );
    }

    private void findCoursesForInstructor(AppDao dao) {
        int id =1;
        System.out.println("Finding instructor id: " + id);

        Instructor instructor = dao.findInstructorById(id);
        System.out.println(" instructor : " + instructor);
        List<Course> courses = dao.findCoursesByInstructorId(id);
        instructor.setCourses(courses);

        System.out.println(" associated courses : " + instructor.getCourses());
        System.out.println(" Done! ");
    }

    private void findInstructorWithCoursesJoinFetch(AppDao dao) {
        int id =1;
        System.out.println("Finding instructor id: " + id);

        Instructor instructor = dao.findInstructorByIdJoinFetch(id);
        System.out.println(" instructor : " + instructor);

        System.out.println(" associated courses : " + instructor.getCourses());
        System.out.println(" Done! ");

    }

    private void updateCourse(AppDao dao) {
        int id =11;
        Course course = dao.findCourseById(id);
        course.setTitle("Ultimate React guide");
        dao.updateCourse(course);
        System.out.println("Done !");
    }

}
