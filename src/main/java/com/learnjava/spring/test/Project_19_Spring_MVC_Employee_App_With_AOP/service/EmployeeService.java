package com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.service;

import com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
