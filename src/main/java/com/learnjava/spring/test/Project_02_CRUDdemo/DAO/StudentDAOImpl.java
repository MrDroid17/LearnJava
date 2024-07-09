package com.learnjava.spring.test.Project_02_CRUDdemo.DAO;

import com.learnjava.spring.test.Project_02_CRUDdemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

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

    @Override
    public Student findById(Integer id) {
        return theEntityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = theEntityManager.createQuery("FROM Student order by lastName desc", Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastname(String lastName) {
        TypedQuery<Student> query = theEntityManager.createQuery("FROM Student WHERE lastName=:LName", Student.class);
        query.setParameter("LName", lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    // using @transactional as using update
    // for read operation @Transactional is not mandatory
    public void update(Student student) {
        theEntityManager.merge(student);
    }

    @Override
    @Transactional
    // using @Transactional as we are modifying database
    // for read operation @Transactional is not mandatory
    public void delete(Integer id) {
        Student student = theEntityManager.find(Student.class, id);
        theEntityManager.remove(student);
    }

    @Override
    @Transactional
    // using @Transactional as we are modifying database
    // for read operation @Transactional is not mandatory
    public int deleteAll() {
        int numsRowsDeleted = theEntityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numsRowsDeleted;
    }
}
