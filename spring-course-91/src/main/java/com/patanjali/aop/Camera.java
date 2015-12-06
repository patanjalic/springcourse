package com.patanjali.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements ICamera {
	/* (non-Javadoc)
	 * @see com.patanjali.aop.ICamera#snap()
	 */
	@Override
	public void snap() {
		System.out.println("snap taken");
	}
	
	/* (non-Javadoc)
	 * @see com.patanjali.aop.ICamera#snap(java.lang.Double)
	 */
	@Override
	public void snap(Double d) {
		System.out.println("snap taken");
	}
	
	/* (non-Javadoc)
	 * @see com.patanjali.aop.ICamera#snap(int, java.lang.Double)
	 */
	@Override
	public void snap(int exposure, Double aperture) {
		System.out.printf("snap taken exposure %d aperture %f\n",exposure,aperture);
	}
}
