package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	
	@Pointcut("execution(* *.*(..))")
	void cameraSnap(){
	}
	
	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap(String))")
	void cameraSnapName(){
	}

	@Before("cameraSnap()")
	void aboutToTakeSnap() {
		System.out.println("about to take photo...");
	}
	
	@Before("cameraSnapName()")
	void aboutToTakeSnapWithName() {
		System.out.println("about to take photo with name");
	}
}
