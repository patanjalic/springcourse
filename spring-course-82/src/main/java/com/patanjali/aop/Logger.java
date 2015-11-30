package com.patanjali.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(void com.patanjali.aop.Camera.snap())")
	public void beforePointCut() {
	}

	@Before("beforePointCut()")
	public void aboutToTakePhoto() {
		System.out.println("about to take photo");
	}
}
