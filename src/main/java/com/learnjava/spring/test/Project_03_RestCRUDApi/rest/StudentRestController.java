package com.learnjava.spring.test.Project_03_RestCRUDApi.rest;

import com.learnjava.spring.test.Project_03_RestCRUDApi.entity.Student;
import com.learnjava.spring.test.Project_03_RestCRUDApi.entity.StudentErrorResponse;
import com.learnjava.spring.test.Project_03_RestCRUDApi.entity.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if(studentId > students.size() || studentId < 0){
            throw new StudentNotFoundException("Student not found with id - " + studentId);
        }
        return students.get(studentId);
    }

    //    Method to handle 404_not_found exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    //    Method to handle generic exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        /*
        * Can add custom msg instead of getting it from exception
        * */
        error.setMessage(exception.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }


}
