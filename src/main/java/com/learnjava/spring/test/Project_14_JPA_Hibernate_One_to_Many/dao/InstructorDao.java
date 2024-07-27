package com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.dao;

import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.Instructor;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.InstructorDetail;

public interface InstructorDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailsById(int id);

    void deleteInstructorDetail(int id);
}
