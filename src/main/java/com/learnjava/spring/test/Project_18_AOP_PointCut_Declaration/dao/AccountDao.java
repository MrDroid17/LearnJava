package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao;

import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAccount();
    void addAccount(Account account, boolean vip);

    boolean addSillyAccount();

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);

}
