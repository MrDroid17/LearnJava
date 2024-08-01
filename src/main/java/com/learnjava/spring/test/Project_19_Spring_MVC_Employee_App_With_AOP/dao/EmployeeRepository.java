package com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.dao;

import com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it
    // add a method to sort by lastaName
    public List<Employee> findAllByOrderByLastNameAsc();

}
