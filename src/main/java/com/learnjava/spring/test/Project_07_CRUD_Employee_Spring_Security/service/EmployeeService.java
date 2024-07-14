package com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.service;

import com.learnjava.spring.test.Project_07_CRUD_Employee_Spring_Security.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
