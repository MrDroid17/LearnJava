package com.learnjava.spring.test.Project_17_AOP.dao;

import com.learnjava.spring.test.Project_17_AOP.Account;

public interface AccountDao {
    void addAccount(Account account, boolean vip);

    boolean addSillyAccount();

    boolean doWork();

}
