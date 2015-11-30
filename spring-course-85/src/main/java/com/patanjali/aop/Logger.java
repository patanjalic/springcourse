package com.patanjali.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
//	@Pointcut("within(@org.springframework.stereotype.Component com.patanjali.aop.Camera)")
//	public void beforePointCut() {
//	}

//	@Pointcut("@target(org.springframework.stereotype.Component)")
//	public void beforePointCut() {
//	}
	
//	@Pointcut("@annotation(Deprecated)")
//	public void beforePointCut() {
//	}

//	@Pointcut("@args(org.springframework.stereotype.Component)")
//	public void beforePointCut() {
//	}
	
	@Pointcut("@args(Deprecated)")
	public void beforePointCut() {
	}
	
	@Before("beforePointCut()")
	public void aboutToTakePhoto() {
		System.out.println("about to take photo");
	}
}
