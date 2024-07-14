package com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.dao;

import com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it
}
