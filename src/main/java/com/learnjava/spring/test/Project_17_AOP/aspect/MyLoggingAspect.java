package com.learnjava.spring.test.Project_17_AOP.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
//    @Before("execution(public void addAccount())")
//    @Before("execution(public void com.learnjava.spring.test.Project_17_AOP.dao.AccountDao.addAccount())")
//    @Before("execution(public void com.learnjava.spring.test.Project_17_AOP.dao.MembershipDao.addAccount())")
//    @Before("execution(public void add*())")
//    @Before("execution(*add*())") // return type to all *
//    @Before("execution(* add*(com.learnjava.spring.test.Project_17_AOP.Account))") // return type to all *
    @Before("execution(* com.learnjava.spring.test.Project_17_AOP.dao.*.*(..))") // for diff no of argument use (..) , match for any parameter and all method
    public void beforeAddAccountAdvice(){
        System.out.println("\n ========> Executing @Before advice on add Account");
    }
}
