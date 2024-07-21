package com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.dao;

import com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it
    // add a method to sort by lastaName
    public List<Employee> findAllByOrderByLastNameAsc();

}
