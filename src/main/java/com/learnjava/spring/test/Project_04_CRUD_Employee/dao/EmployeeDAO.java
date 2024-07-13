package com.learnjava.spring.test.Project_04_CRUD_Employee.dao;

import com.learnjava.spring.test.Project_04_CRUD_Employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

   List<Employee> findAll();

   Employee findById(int id);

   Employee save(Employee employee);

   void deleteById(int id);

}
