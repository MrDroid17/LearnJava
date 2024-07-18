package com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf.controller;

import com.learnjava.spring.test.Project_08_Spring_MVC_Thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        Student student = new Student();
        theModel.addAttribute("student", student);


        return "student-form";

    }
}
