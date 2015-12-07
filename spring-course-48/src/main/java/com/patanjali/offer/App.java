package com.patanjali.offer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		OfferDAO offer = (OfferDAO)ctx.getBean("offerDao");
		try {
			Offer offe = offer.getOffers(1);
			offe.setEmail("bobnew@bob.com");
			offe.setName("bobnew");
			offe.setText("i am updated bob");
			offer.update(offe);
			System.out.println(offer.getOffers(1));
		} catch(DataAccessException e) {
			System.out.println("dao exception "+e.getMessage());
			System.out.println("class "+e.getClass());
		}
		ctx.close();
	}
}
