package com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.rest;


import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.entity.Employee;
import com.learnjava.spring.test.Project_05_CRUD_Employee_Spring_data_JPA.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee id not found  - " + employeeId);
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        /*
        * Also just in case  they pass an id in JSON ... set id to 0
        * this is to force a save of new item ... instead of update
        * */
        employee.setId(0);;
        Employee emp = employeeService.save(employee);

        return emp;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.save(employee);
        return emp;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee id now found - "+ employeeId);
        }

        employeeService.deleteById(employeeId);;
        return "Deleted employee id - " + employeeId;
    }


}
