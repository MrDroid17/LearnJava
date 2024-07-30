package com.learnjava.spring.test.Project_17_AspectOrientedProgramming.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{
    @Override
    public void addAccount() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a account...");
    }
}
