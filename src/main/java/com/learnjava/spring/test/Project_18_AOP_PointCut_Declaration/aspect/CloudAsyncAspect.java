package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class CloudAsyncAspect {

    /**
     * Using Pointcut declaration
     */
    @Before("com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect.AOP_PointCutExpression.forDaoPackageNoGetterSetter()")
    public void cloudASyncLog(){
        System.out.println("========> Executing Cloud async Log ....");

    }
}
