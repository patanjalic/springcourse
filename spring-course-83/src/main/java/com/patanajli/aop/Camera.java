package com.patanajli.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, Machine{
	public void snap() {
		System.out.println("picture taken");
	}
	
	public void snapNightMode() {
		System.out.println("picture taken in nightmode");
	}
}
