package com.patanjali.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
	@Pointcut("args(exposure,aperture)")
	public void beforePointCut(int exposure, Double aperture) {
	}
	
	@Pointcut("target(com.patanjali.aop.Camera)")
	public void targetPointCut() {
	}
	
	@Before("targetPointCut() && beforePointCut(exposure,aperture)")
	void aboutToTakePhoto(JoinPoint jp, int exposure, Double aperture) {
		System.out.println("about to take photo");
		System.out.printf("logger exposure %d aperture %f\n",exposure,aperture);
		for(Object obj:jp.getArgs()) {
			System.out.println("obj is "+obj.getClass());
		}
	}
	
	@After("targetPointCut() && @annotation(Deprecated)")
	void afterTakePhoto() {
		System.out.println("after take photo!!!!!!!!!!!!!!!");
	}
	
}
