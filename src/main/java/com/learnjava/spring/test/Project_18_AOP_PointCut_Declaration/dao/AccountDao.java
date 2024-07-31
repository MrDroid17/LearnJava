package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao;

import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.Account;

public interface AccountDao {
    void addAccount(Account account, boolean vip);

    boolean addSillyAccount();

    boolean doWork();

}
