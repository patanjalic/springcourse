package com.patanjali.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/* doesnt work the way given in course, may be it was a bug and they fixed in latest version*/
public class App {
	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/patanjali/aop/beans.xml");
		Object obj = ctx.getBean("camera");
		System.out.println("class of obj is "+obj.getClass());
		System.out.println(obj instanceof Camera);
		Camera cam = (Camera)ctx.getBean("camera");
		cam.snap();
		Car car = (Car)ctx.getBean("car");
		car.start();
		ctx.close();
	}
}
