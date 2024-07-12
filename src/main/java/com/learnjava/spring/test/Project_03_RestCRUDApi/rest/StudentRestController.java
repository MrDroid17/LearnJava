package com.learnjava.spring.test.Project_03_RestCRUDApi.rest;

import com.learnjava.spring.test.Project_03_RestCRUDApi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
     private List<Student>  students;

     // define @PostConstruct to load the student data .... only once
    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Sobhit", "Kumar"));
        students.add(new Student("Shweta", "Singh"));
        students.add(new Student("Rohan", "Singh"));
        System.out.println(students);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentsById(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
