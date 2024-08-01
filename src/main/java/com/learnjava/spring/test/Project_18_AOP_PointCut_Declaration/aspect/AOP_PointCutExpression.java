package com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class AOP_PointCutExpression {

    /**
     * Defining pointcut declaration
     */
    @Pointcut("execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.*.*(..))")
    public void  forDaoPackage(){}

    @Pointcut("execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.*.get*(..))")
    public void  getter(){}

    @Pointcut("execution(* com.learnjava.spring.test.Project_18_AOP_PointCut_Declaration.dao.*.set*(..))")
    public void  setter(){}

    /**
     * Combining Pointcut Expression
     */
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void  forDaoPackageNoGetterSetter(){}

}
