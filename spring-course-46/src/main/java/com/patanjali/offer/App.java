package com.patanjali.offer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		OfferDAO offer = (OfferDAO)ctx.getBean("offerDao");
		try {
			List<Offer> offers = offer.getOffers();
			for(Offer off:offers) {
				System.out.println(off);
			}
			Offer offe = offer.getOffers(1);
			System.out.println("should be bob "+offe);
			
			System.out.println("ana deleted? "+offer.deleteOffer(8));
		} catch(DataAccessException e) {
			System.out.println("dao exception "+e.getMessage());
			System.out.println("class "+e.getClass());
		}
		ctx.close();
	}
}
