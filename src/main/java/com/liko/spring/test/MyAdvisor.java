package com.liko.spring.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by likoguan on 2/12/18.
 */
@Component
@Aspect
public class MyAdvisor {
    @Before("execution(* net.latipay.auth.test.Baby.eat(..))")
    public void beforeEat() {
        System.out.println("before eat, wash hands");
    }

    @AfterReturning(returning = "result", pointcut = "execution(* net.latipay.auth.test.Baby.drink(..))")
    public void afterDrink(Object result) {
        System.out.println("after drink, get result:" + result);
    }

    @AfterThrowing(throwing = "t", pointcut = "execution(* net.latipay.auth.test.Baby.sleep(..))")
    public void afterThrowing(Object t) {
        System.out.println(((Throwable)t).getMessage());
    }

    @Around("execution(* net.latipay.auth.test.Baby.watch(..))")
    public void around(ProceedingJoinPoint pjp) {
        try {
            System.out.println("turn on the tv");
            pjp.proceed(new Object[]{"love"});
            System.out.println("turn off the tv");
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
