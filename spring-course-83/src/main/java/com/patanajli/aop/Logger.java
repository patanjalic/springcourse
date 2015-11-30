package com.patanajli.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("within(com.patanajli.aop.*)")
	public void beforePointCut() {
	}

	@Before("beforePointCut()")
	public void aboutToTakePhoto() {
		System.out.println("about to take photo");
	}
}
