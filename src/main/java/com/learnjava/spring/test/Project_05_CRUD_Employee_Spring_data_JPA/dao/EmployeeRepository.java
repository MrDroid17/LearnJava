package com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.dao;

import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it
}
