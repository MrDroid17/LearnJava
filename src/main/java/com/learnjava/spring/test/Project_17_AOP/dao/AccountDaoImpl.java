package com.learnjava.spring.test.Project_17_AOP.dao;

import com.learnjava.spring.test.Project_17_AOP.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao{


    @Override
    public void addAccount(Account account, boolean vip) {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Account...");
    }

    @Override
    public boolean addSillyAccount() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Silly Account...");
    return true;
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a doWork() function...");
        return false;
    }
}
