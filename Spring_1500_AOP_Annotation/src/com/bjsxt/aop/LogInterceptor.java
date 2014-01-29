package com.bjsxt.aop;

import javax.annotation.PostConstruct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogInterceptor {
	@Pointcut("execution(public * com.bjsxt..*.*(..))")
	public void myMethod(){};
	
	@Before("myMethod()")
	public void before() {
		System.out.println("method before");
	}
	@AfterReturning("myMethod()")
	public void afterReturning() {
		System.out.println("method after returning");
	}
	@AfterThrowing("myMethod()")
	public void aftertng() {
		System.out.println("method after exeception");
	}
	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start");
		pjp.proceed();
		System.out.println("method around end");
	}
}
