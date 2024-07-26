package com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping.dao;

import com.learnjava.spring.test.Project_12_JPA_Hibernate_Advanced_Mapping.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class InstructorDaoImpl implements InstructorDao{

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
}
