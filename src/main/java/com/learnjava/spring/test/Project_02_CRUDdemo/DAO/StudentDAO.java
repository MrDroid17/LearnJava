package com.learnjava.spring.test.Project_02_CRUDdemo.DAO;

import com.learnjava.spring.test.Project_02_CRUDdemo.entity.Student;
import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastname(String lastName);

    void update(Student student);

    void delete(Integer id);

    int deleteAll();

}
