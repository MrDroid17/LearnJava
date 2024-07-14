package com.learnjava.spring.test.Project_06_CRUD_Employee_Spring_Data_JPA_REST.dao;

import com.learnjava.spring.test.Project_06_CRUD_Employee_Spring_Data_JPA_REST.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it
}
