package com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.dao;

import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.entity.Course;
import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.entity.Instructor;
import com.learnjava.spring.test.Project_15_JPA_Hibernate_One_to_Many_Uni.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AppDaoImpl implements AppDao {

    private EntityManager entityManager;

    public AppDaoImpl() {

    }

    @Autowired
    public AppDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        Instructor instructor = entityManager.find(Instructor.class, id);
        /**
         * Get the courses and break the association for all the instructor
         * if we dont break the exception we will get the exception
         * SQLIntegrityConstraintViolationException
         */
        List<Course> courses = instructor.getCourses();
        for(Course course: courses){
            course.setInstructor(null);
        }

        entityManager.remove(instructor);
    }

    @Override
    public InstructorDetail findInstructorDetailsById(int id) {
        return entityManager.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetail(int id) {
        InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, id);

        // remove the bi-directional link
        instructorDetail.getInstructor().setInstructorDetail(null);

        entityManager.remove(instructorDetail);
    }

    @Override
    public List<Course> findCoursesByInstructorId(int id) {
        TypedQuery<Course> query = entityManager.createQuery("from Course where instructor.id = :data", Course.class);
        query.setParameter("data", id);
        List<Course> courses =  query.getResultList();
        return courses;
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int id) {
        TypedQuery<Instructor> query = entityManager.createQuery("select i from Instructor i "
                                                                    + "JOIN FETCH i.courses "
                                                                    + "JOIN FETCH i.instructorDetail "
                                                                    + "where i.id =:data", Instructor.class);
        query.setParameter("data", id);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public void updateCourse(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    public Course findCourseById(int id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    @Transactional
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    @Override
    @Transactional
    public void deleteCourseById(int id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    @Override
    @Transactional
    public void save(Course course) {
        entityManager.persist(course);
    }

    @Override
    public Course findCourseAndReviewByCourseId(int id) {
        TypedQuery<Course> query = entityManager.createQuery("select c from Course c "
                                                                + "JOIN FETCH c.reviews "
                                                                +" where c.id= :data", Course.class);
        query.setParameter("data", id);

        return query.getSingleResult();
    }
}
