package com.caveofprogramming.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caveofprogramming.spring.camera.accessories.Lens;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/caveofprogramming/spring/aop/beans.xml");
		Camera cam = (Camera)ctx.getBean("camera");
		Lens lens = (Lens)ctx.getBean("lens");
		cam.snap();
		cam.snap(1000);
		cam.snap("kittu");
		cam.snapNightMode();
		lens.zoom(5);
		ctx.close();
	}

}
