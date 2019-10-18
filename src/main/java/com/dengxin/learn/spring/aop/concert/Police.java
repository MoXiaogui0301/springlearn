package com.dengxin.learn.spring.aop.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author DengXin
 * @date 2019/10/18 3:06 PM
 */
@Aspect
public class Police {

    @Pointcut("execution(* com.dengxin.learn.spring.aop.concert.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void securePerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("guarding concert");
            System.out.println("checking crowding");
            joinPoint.proceed();
            System.out.println("Completing security");
        } catch (Throwable e) {
            System.out.println("catching robber");;
        }
    }
}
