package com.patanjali.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/patanjali/aop/beans.xml");
		ICamera cam = (ICamera)ctx.getBean("camera");
		cam.snap();
		cam.snap(10.0);
		cam.snap(1,10.0);
		IFan fan = (IFan)ctx.getBean("fan");
		fan.start1();
		((IMachine)cam).start();
		System.out.println("try");
		((IMachine)fan).start();
		ctx.close();
	}
}
