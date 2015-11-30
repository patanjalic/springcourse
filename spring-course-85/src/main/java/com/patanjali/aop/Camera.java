package com.patanjali.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, Machine{
	@Deprecated
	public void snap() {
		System.out.println("picture taken");
	}
	
	public void snapNightMode() {
		System.out.println("picture taken in nightmode");
	}
	
	public void snapCar(Car car) {
		System.out.println("snapped car pic");
	}
}
