package com.patanjali.aop;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void start() {
		System.out.println("starting car");
	}
}
