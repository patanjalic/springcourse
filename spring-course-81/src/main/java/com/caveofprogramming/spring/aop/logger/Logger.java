package com.caveofprogramming.spring.aop.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(void com.caveofprogramming.spring.aop.Camera.snap())")
	public void snapPointCut() {
	}
	
	@Before("snapPointCut()")
	public void aboutToTakeSnap(){
		System.out.println("about to take snap");
	}
	
	@After("snapPointCut()")
	public void afterSnap(){
		System.out.println("took the snap, uploading to cloud finally");
	}
	
	@AfterReturning("snapPointCut()")
	public void afterSnapReturning(){
		System.out.println("took the snap, uploading to cloud");
	}
	
	@AfterThrowing("snapPointCut()")
	public void ErrorSnap() {
		System.out.println("picture not take, check it please");
	}
	
	@Around("snapPointCut()")
	public void AroundSnap(ProceedingJoinPoint p) throws Throwable {
		System.out.println("before around advice");
		try {
			p.proceed();
		} catch (Throwable e) {
//			e.getMessage();
			throw e;
		}
		System.out.println("after around advice");
	}
}
