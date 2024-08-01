package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyAnalyticAspect {

    /**
     * Using Pointcut declaration
     */
    @Before("com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect.AOP_PointCutExpression.forDaoPackageNoGetterSetter()")
    public void performApiAnalatics(){
        System.out.println("========> Executing @performing api Anayatics ....");

    }
}
