package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() {
		System.out.println("picture taken...");
	}
	
	public void snap(int exposure) {
		System.out.println("picture taken exposure "+exposure);
	}
	
	public String snap(String name) {
		System.out.println("picture taken name "+name);
		return name;
	}
	
	public void snapNightMode() {
		System.out.println("picture nightmode ");
	}
}
