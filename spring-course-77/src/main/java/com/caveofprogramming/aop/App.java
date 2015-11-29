package com.caveofprogramming.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/caveofprogramming/aop/beans.xml");
		Camera cam = (Camera)(ctx.getBean("camera"));
		cam.snap();
		ctx.close();
	}
	
}
