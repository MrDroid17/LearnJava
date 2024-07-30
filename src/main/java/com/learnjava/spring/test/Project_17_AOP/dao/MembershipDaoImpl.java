package com.learnjava.spring.test.Project_17_AOP.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao{
    @Override
    public void addAccount() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Membership ...");
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : I am going to sleep ...");
    }
}
