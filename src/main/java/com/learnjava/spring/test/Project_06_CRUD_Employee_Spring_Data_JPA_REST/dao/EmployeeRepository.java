package com.learnjava.spring.test.Project_06_CRUD_Employee_Spring_Data_JPA_REST.dao;

import com.learnjava.spring.test.Project_06_CRUD_Employee_Spring_Data_JPA_REST.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
* to change api path from employees to members
* */
//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it

}
