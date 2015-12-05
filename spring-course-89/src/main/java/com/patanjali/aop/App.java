package com.patanjali.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/patanjali/aop/beans.xml");
		Camera cam = (Camera)ctx.getBean("camera");
		cam.snap();
		cam.snap(10.0);
		cam.snap(1,10.0);
		ctx.close();
	}
}
