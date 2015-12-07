package com.patanjali.offer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		OfferDAO offer = (OfferDAO)ctx.getBean("offerDao");
		List<Offer> offers = offer.getOffers();
		for(Offer off:offers) {
			System.out.println(off);
		}
		ctx.close();
	}
}
