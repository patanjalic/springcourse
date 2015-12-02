package com.patanjali.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	@Pointcut("target(com.patanjali.aop.Camera)")
	public void beforePointCut() {
	}
	
	@Before("beforePointCut()")
	void aboutToTakePhoto(JoinPoint jp) {
		System.out.println("about to take photo");
		for(Object obj:jp.getArgs()) {
			System.out.println("obj is "+obj.getClass());
		}
	}
}
