package com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni;


import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.dao.AppDao;
import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.entity.Course;
import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.entity.Review;
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

//            createCourseAndReview(dao);
//            retriveCourseAndReviews(dao);
            deleteCourseAndReviews(dao);

        };
    }


    private void createCourseAndReview(AppDao dao) {
        Course course = new Course("React beginner guide");

        course.addReview(new Review("What a course. you nailed it."));
        course.addReview(new Review("Great course. keep it up."));
        course.addReview(new Review("Very Bad, What a nightmare of a course."));

        System.out.println("Saving data..." + course);
        dao.save(course);
        System.out.println("Done !");
    }

    private void retriveCourseAndReviews(AppDao dao) {
        int id = 10;
        Course course = dao.findCourseAndReviewByCourseId(id);
        System.out.println("Course..." + course);
        System.out.println("Reviews " + course.getReviews());

    }

    private void deleteCourseAndReviews(AppDao dao) {
        int id =10;
        System.out.println("Deleting course..." + id);
        dao.deleteCourseById(id);
        System.out.println("Done !");

    }

}
