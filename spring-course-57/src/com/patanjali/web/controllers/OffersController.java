package com.patanjali.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patanjali.web.dao.Offer;
import com.patanjali.web.service.OffersService;

@Controller
public class OffersController {

	/*@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mv = new ModelAndView("home");
		Map<String,Object> model = mv.getModel();
		model.put("name", "Eeshu");
		return mv;
	}*/
	
	@Autowired
	private OffersService offersService;
	
	@RequestMapping("/")
	public String showHome() {
		return "landingpage";
	}
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer() {
		return "createoffer";
	}
}
