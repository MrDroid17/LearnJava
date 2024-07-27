package com.learnjava.spring.test.Project_13_JPA_Hibernate_One_to_one_Bi.dao;

import com.learnjava.spring.test.Project_13_JPA_Hibernate_One_to_one_Bi.entity.Instructor;

public interface InstructorDao {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);
}
