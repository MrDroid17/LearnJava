package com.learnjava.spring.test.Project_03_RestCRUDApi.rest;

import com.learnjava.spring.test.Project_03_RestCRUDApi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sobhit", "Kumar"));
        students.add(new Student("Shweta", "Singh"));
        students.add(new Student("Rohan", "Singh"));

        return students;
    }
}
