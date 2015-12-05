package com.patanjali.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() {
		System.out.println("snap taken");
	}
	
	public void snap(Double d) {
		System.out.println("snap taken");
	}
	
	public void snap(int exposure, Double aperture) {
		System.out.printf("snap taken exposure %d aperture %f\n",exposure,aperture);
	}
}
