package com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.dao;

import com.learnjava.spring.test.Project_12_JPA_Hibernate_One_to_one_Uni.entity.Instructor;

public interface InstructorDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);
}
