package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect;


import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
@Order(1)
public class MyLoggingAspect {
    /**
     * Using @Around Advice
     */
    @Around("execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.service.*.getFortune(..))")
    public Object aroundGetFortuneAdvice(ProceedingJoinPoint proceedingJoinPoint){
        String method = proceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n =====>  Executing @Around Advice on method : " + method);

        long start = System.currentTimeMillis();
        Object result = new Object();
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println( e.getMessage());
//            result = "major Accident ... But no worries.. Help is on the way.";

            // rethrow exception
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();

        long duration = end-start;

        System.out.println("Duration is : " + duration);

        return result;
    }

    /**
     * using @After Advice
     */
    @After("execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.AccountDao.findAccount(..))")
    public void afterFinalllyFindAccountAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().toShortString();

        System.out.println("\n =====>  Executing @AfterFinally Advice on method : " + method);
    }

    /**
     * Using @AfterThrowing Advice
     */
    @AfterThrowing(
            pointcut = "execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.AccountDao.findAccount(..))",
            throwing = "exception"
    )
    public void afterThrowingFindAccountAdvice(JoinPoint joinPoint, Exception exception){

        String method = joinPoint.getSignature().toShortString();

        System.out.println("\n =====>  Executing @AfterThrowing Advice on method : " + method);
        System.out.println("\n ====> Exception is : " + exception);
    }

    /**
     * Using @AfterReturning Advice
     */
    @AfterReturning(
            pointcut = "execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.AccountDao.findAccount(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result){
        String method = joinPoint.getSignature().toShortString();

        System.out.println("\n =====>  Executing @AfterReturning on method : " + method);
        System.out.println("\n ====> result is : " + result);

        // let post process the data and modify it
        // convert the account name to uppercase
        convertFirstNameToUpperCase(result);

        System.out.println("\n ====> result is(FirstName in Uppercase) : " + result);

    }

    private void convertFirstNameToUpperCase(List<Account> result) {

        for(Account account : result){
            String firstName = account.getFirstName().toUpperCase();
            account.setFirstName(firstName);
        }
    }


    /**
     * Using Pointcut declaration @Before
     */
    @Before("com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect.AOP_PointCutExpression.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){
        System.out.println("========> Executing Logging advice...");

        /**
         * JoinPoint
         */
        MethodSignature methodSignature = (MethodSignature)  joinPoint.getSignature();
        System.out.println("Method : =====> :" +methodSignature);

        Object[] args= joinPoint.getArgs();

        for(Object  arg: args){
            System.out.println(arg);

            if(arg instanceof Account){
                Account account = (Account) arg;

                System.out.println("Account first name: " + account.getFirstName());
                System.out.println("Account last name: " + account.getLastName());
            }
        }
     }



}
