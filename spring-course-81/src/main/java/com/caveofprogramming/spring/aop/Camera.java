package com.caveofprogramming.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	public void snap() throws Exception{
		System.out.println("truing to take picture");
		throw new Exception("no reel");
	}
}
