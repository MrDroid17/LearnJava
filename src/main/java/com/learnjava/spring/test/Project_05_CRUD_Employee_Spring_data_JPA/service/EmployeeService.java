package com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.service;

import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
