package com.patanjali.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	@DeclareParents(value="com.patanjali.aop.*",defaultImpl=com.patanjali.aop.Machine.class)
	private IMachine machine;
	
	@Pointcut("within(com.patanjali.aop.*)")
	public void aroundPointCut() {
	}
	
	@Around("aroundPointCut()")
	void aboutToTakePhoto(ProceedingJoinPoint jp) {
		System.out.println("around advice called......");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after function call...........");
	}
}
