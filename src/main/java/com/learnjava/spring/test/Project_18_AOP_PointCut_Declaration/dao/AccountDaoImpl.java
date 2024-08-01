package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao;

import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {
    private String name;
    private String serviceCode;


    @Override
    public List<Account> findAccount() {
        return  findAccount(false);
    }

    @Override
    public List<Account> findAccount(boolean tripWire) {
        /**
         * Simulate exception
         */
        if(tripWire){
            throw new RuntimeException("New Runtime Exception....");
        }
        List<Account> accounts = new ArrayList<>();
        Account acc1 = new Account("John", "Doe");
        Account acc2 = new Account("Madhu", "Mokka");
        Account acc3 = new Account("Sobhit", "Kumar");

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        return accounts;
    }

    @Override
    public void addAccount(Account account, boolean vip) {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Account...\n");
    }

    @Override
    public boolean addSillyAccount() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a Silly Account...\n");
    return true;
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass().getSimpleName() + "----->  : Doing DB work : Adding a doWork() function...\n");
        return false;
    }

    public String getName() {
        System.out.println(getClass().getSimpleName() + "----->  : Inside getName() function...\n");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass().getSimpleName() + "----->  : Inside setName() function...\n");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass().getSimpleName() + "----->  : Inside getServiceCode() function...\n");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass().getSimpleName() + "----->  : Inside setServiceCode() function...\n");
        this.serviceCode = serviceCode;
    }
}
