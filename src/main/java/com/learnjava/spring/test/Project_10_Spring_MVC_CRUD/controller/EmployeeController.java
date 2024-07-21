package com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.controller;

import com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.entity.Employee;
import com.learnjava.spring.test.Project_10_Spring_MVC_CRUD.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model){

        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);

        return "employees/list-employees";
    }

    @GetMapping("/add-employee")
    public String addEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employees/employee-form";

    }

    @GetMapping("/update-employee")
    public String updateEmployeeForm(@RequestParam("employeeId") int id, Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);

        return "employees/employee-form";

    }
    @GetMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("employeeId") int id){

        employeeService.deleteById(id);
        return "redirect:/employees/list";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }
}
