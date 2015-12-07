package com.patanjali.offer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		OfferDAO offer = (OfferDAO)ctx.getBean("offerDao");
		try {
			System.out.println("before insert "+offer.getOffers().size());
			offer.create(new Offer("srilatha","sri@gmail.com","sap hcm consultant"));
			offer.create(new Offer("scarlett johansson","scarlett@gmail.com","hollywood actress"));
			System.out.println("before insert "+offer.getOffers().size());
		} catch(DataAccessException e) {
			System.out.println("dao exception "+e.getMessage());
			System.out.println("class "+e.getClass());
		}
		ctx.close();
	}
}
