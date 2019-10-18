package com.dengxin.learn.spring.aop.concert;

import org.aspectj.lang.annotation.*;

/**
 * @author DengXin
 * @date 2019/10/18 2:32 PM
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.dengxin.learn.spring.aop.concert.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
