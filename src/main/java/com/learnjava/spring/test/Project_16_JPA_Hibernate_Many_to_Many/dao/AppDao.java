package com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.dao;

import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Course;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Instructor;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.InstructorDetail;

import java.util.List;

public interface AppDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailsById(int id);

    void deleteInstructorDetail(int id);

    List<Course> findCoursesByInstructorId(int id);

    Instructor findInstructorByIdJoinFetch(int id);

    void updateCourse(Instructor instructor);

    Course findCourseById(int id);

    void updateCourse(Course course);

    void deleteCourseById(int id);

    void save(Course course);

    Course findCourseAndReviewByCourseId(int id);

}
