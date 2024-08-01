package com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private Logger myLogger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.controller.*.*(..))")
    private void forControllerPackage(){}

    @Pointcut("execution(* com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.service.*.*(..))")
    private void forServicePackage(){}

    @Pointcut("execution(* com.learnjava.spring.test.Project_19_Spring_MVC_Employee_App_With_AOP.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void applyForAllPackage(){}

    @Before("applyForAllPackage()")
    private void forAppFlow(JoinPoint joinPoint){
        // Display method we are calling
        String method = joinPoint.getSignature().toShortString();
        myLogger.info("In @Before : Calling a Method " + method);

        // Display argument to the method
        Object[] args = joinPoint.getArgs();

        for(Object arg : args){
            myLogger.info("=====> Argument"+ arg);
        }

    }

    @AfterReturning(
            pointcut = "applyForAllPackage()",
            returning = "result"
    )
    private void afterReturning(JoinPoint joinPoint, Object result){

        String method = joinPoint.getSignature().toShortString();
        myLogger.info("In @AfterReturning : Calling a Method " + method);

        myLogger.info("=======> In @AfterReturning : Result " + result);

    }




}
