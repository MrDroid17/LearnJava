package com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.dao;

import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.Instructor;
import com.learnjava.spring.test.Project_14_JPA_Hibernate_One_to_Many.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class InstructorDaoImpl implements InstructorDao {

    private EntityManager entityManager;

    public InstructorDaoImpl() {

    }

    @Autowired
    public InstructorDaoImpl(EntityManager entityManager) {
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
}
