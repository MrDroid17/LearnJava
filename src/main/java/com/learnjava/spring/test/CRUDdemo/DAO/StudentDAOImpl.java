package com.learnjava.spring.test.CRUDdemo.DAO;

import com.learnjava.spring.test.CRUDdemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    EntityManager theEntityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager) {
        this.theEntityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        this.theEntityManager.persist(theStudent);
    }
}
