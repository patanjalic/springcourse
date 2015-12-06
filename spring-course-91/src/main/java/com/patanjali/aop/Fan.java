package com.patanjali.aop;

import org.springframework.stereotype.Component;

@Component
public class Fan implements IFan {
	/* (non-Javadoc)
	 * @see com.patanjali.aop.IFan#start()
	 */
	@Override
	public void start1() {
		System.out.println("starting fan.....");
	}
}
