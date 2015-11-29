package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		Camera cam = (Camera)ctx.getBean("camera");
		try {
			cam.snap();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ctx.close();
	}
}
