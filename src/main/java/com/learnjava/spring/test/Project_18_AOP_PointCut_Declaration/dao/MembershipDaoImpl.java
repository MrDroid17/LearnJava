package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao {
    @Override
    public void addAccount() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Membership ...\n");
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : I am going to sleep ...\n");
    }
}
