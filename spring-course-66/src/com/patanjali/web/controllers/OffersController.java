package com.patanjali.web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

//	@ExceptionHandler(DataAccessException.class)
//	public String handleDatabaseException(DataAccessException ex) {
//		return "error";
//	}
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		//offersService.testThrowException();
		List<Offer> offers = offersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model) {
		model.addAttribute("offer", new Offer());
		return "createoffer";
	}

	@RequestMapping(value = "/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result) {
		System.out.println(offer);
		if(result.hasErrors()) {
			return "createoffer";
		}
		offersService.create(offer);
		return "offercreated";
	}

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String testOffer(@RequestParam("id") String id) {
		System.out.println("requested id is "+id);
		return "landingpage";
	}
}
