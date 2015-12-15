package com.patanjali.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patanjali.web.dao.Offer;
import com.patanjali.web.dao.OfferDAO;

@Service("offersService")
public class OffersService {

	@Autowired
	private OfferDAO offersDao;
	
	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}

	public void create(Offer offer) {
		offersDao.create(offer);
	}

	public void testThrowException() {
		offersDao.getOffers(99999);
	}
}
