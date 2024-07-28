package com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many;


import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.dao.AppDao;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Course;
import com.learnjava.spring.test.Project_16_JPA_Hibernate_Many_to_Many.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JPAHibernateManyToMany {
    public static void main(String[] args) {
        SpringApplication.run(JPAHibernateManyToMany.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao dao) {
        return runner -> {
//            createCourseAndStudents(dao);
//            findCourseAndStudents(dao);
//            findStudentAndCourses(dao);
//            addMoreCoursesForStudent(dao);
//            deleteCourse(dao);
            deleteStudent(dao);
        };
    }

    private void createCourseAndStudents(AppDao dao) {
        Course course = new Course("React beginner guide");

        Student student = new Student("Rohit", "Kaneria", "rkaneria@gamil.com");
        Student student2 = new Student("Mohit", "Saini", "msaini@gamil.com");
        Student student3 = new Student("Sonam", "Ramesh", "sramesh@gamil.com");

        course.addStudent(student);
        course.addStudent(student2);
        course.addStudent(student3);

        System.out.println("Saving courses..." + course);
        dao.save(course);
        System.out.println("Done !");
    }

    private void findCourseAndStudents(AppDao dao) {
        int id =10;
        Course course = dao.findCourseAndStudentByCourseId(id);

        System.out.println("Course..." + course);
        System.out.println("Students " + course.getStudents());

    }

    private void findStudentAndCourses(AppDao dao) {
        int id =2;
        Student student = dao.findStudentAndCourseByStudentId(id);

        System.out.println("Student..." + student);
        System.out.println("Courses " + student.getCourses());
    }

    private void addMoreCoursesForStudent(AppDao dao) {
        int id =2;
        Student student = dao.findStudentAndCourseByStudentId(id);

        Course course = new Course("Solve a Rubik's Cube effectively");
        Course course2 = new Course("Learning Basic Java");

        student.addCourse(course);
        student.addCourse(course2);
        System.out.println("Update student with courses..." + student);
        dao.update(student);
        System.out.println("Done !");
    }

    private void deleteCourse(AppDao dao) {
        int id =10;
        dao.deleteCourseById(id);
        System.out.println("Course Deleted !");

    }

    private void deleteStudent(AppDao dao) {
        int id = 1;
        dao.deleteStudentById(id);
        System.out.println("Student Deleted !");
    }


}
