package com.patanjali.offer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

public class App {

	public static void main(String... args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		OfferDAO offer = (OfferDAO)ctx.getBean("offerDao");
		try {
			List<Offer> offers = new ArrayList<>();
			offers.add(new Offer(25,"daisy","daisy@jobs.com","webapp developer with nosql"));
			offers.add(new Offer(23,"samantha","samantha@jobs.com","webapp developer with sql"));
			offer.create(offers);
			for(Offer off:offer.getOffers()) {
				System.out.println(off);
			}
		} catch(DataAccessException e) {
			System.out.println("dao exception "+e.getMessage());
			System.out.println("class "+e.getClass());
		}
		ctx.close();
	}
}
