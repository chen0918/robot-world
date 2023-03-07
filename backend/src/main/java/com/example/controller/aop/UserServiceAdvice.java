package com.example.controller.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Component
@Aspect
public class UserServiceAdvice {
    @Pointcut("execution(* com.example.service.impl.UserServiceImpl.*(..))")
    public void pt(){}

    @Around("pt()")
    public Object fn(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object ret = pjp.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println("Aspect: "+(endTime-startTime)+" ms was costed for->"+pjp.getSignature());
        return ret;
    }
}
