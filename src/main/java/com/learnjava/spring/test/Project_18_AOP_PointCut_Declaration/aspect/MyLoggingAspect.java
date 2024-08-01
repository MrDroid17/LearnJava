package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect;


import com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyLoggingAspect {

    /**
     * Using Pointcut declaration
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
