package com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.service;

import com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
