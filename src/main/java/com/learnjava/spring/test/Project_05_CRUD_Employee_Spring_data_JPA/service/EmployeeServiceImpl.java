package com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.service;

import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.dao.EmployeeRepository;
import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int id) {

        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if(result.isPresent()){
            employee = result.get();
        } else {
           throw new RuntimeException("Did not find Employee id " + id);
        }

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}