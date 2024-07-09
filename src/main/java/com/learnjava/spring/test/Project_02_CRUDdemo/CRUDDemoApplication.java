package com.learnjava.spring.test.Project_02_CRUDdemo;

import com.learnjava.spring.test.Project_02_CRUDdemo.DAO.StudentDAO;
import com.learnjava.spring.test.Project_02_CRUDdemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CRUDDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CRUDDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDao) {
        return runner -> {
//            createStudent(studentDao);
//            readStudent(studentDao);
//            getAllStudents(studentDao);
//            getAllStudentsByLastName(studentDao);
//            updateStudent(studentDao);
//            deleteStudent(studentDao);
//            deleteAll(studentDao);
        };
    }

    private void deleteAll(StudentDAO studentDao) {
        System.out.println("Deleting all students....");
        int count = studentDao.deleteAll();
        System.out.println("Deleted record count : "+ count);
    }

    private void createStudent(StudentDAO studentDao) {
        System.out.println("Creating Student");
        Student tempStudent = new Student("Sachin", "Kumar", "sobhit2010@gmail.com");
        Student tempStudent2 = new Student("Derek", "Singh", "rohan@gmail.com");
        Student tempStudent3 = new Student("Rahul", "Kumar", "dlazy@gmail.com");

        System.out.println("Saving Student");
        studentDao.save(tempStudent);
        studentDao.save(tempStudent2);
        studentDao.save(tempStudent3);

        System.out.println("Get saved Student id: " + tempStudent.getId());
        System.out.println("Get saved Student id: " + tempStudent2.getId());
        System.out.println("Get saved Student id: " + tempStudent3.getId());
    }

    private void readStudent(StudentDAO studentDao) {
        System.out.println("retriveing student");
        Student student = studentDao.findById(3);

        System.out.println("Found the student: " + student);

    }

    private void getAllStudents(StudentDAO studentDao) {
        List<Student> students = studentDao.findAll();

        for(Student tempStudent : students){
            System.out.println(tempStudent);
        }

    }

    private void getAllStudentsByLastName(StudentDAO studentDao) {
        List<Student> students = studentDao.findByLastname("Kumar");
        for(Student student : students){
            System.out.println(student);
        }
    }

    private void updateStudent(StudentDAO studentDao) {
        int studentId =1;
        System.out.println("Getting student with id: " + studentId);
        Student student = studentDao.findById(studentId);

        System.out.println("Updating student...");
        student.setFirstName("John");
        studentDao.update(student);

        System.out.println("Print updated student.");
        Student updatedStudent = studentDao.findById(studentId);
        System.out.println(updatedStudent);

    }

    private void deleteStudent(StudentDAO studentDao) {
        int studentId = 5;
        System.out.println("Deleting student id:" + studentId);
        studentDao.delete(studentId);

    }


}
