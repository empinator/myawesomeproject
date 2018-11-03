package de.studiapp.pms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.studiapp.pms.service.VorlesungsverschiebungService;

@Controller
@RequestMapping("/vv")
public class VorlesungsverschiebungsController {
	
	@Autowired
	private VorlesungsverschiebungService vorlesungsverschiebungService;
	
	 @RequestMapping(value="/findAll", method=RequestMethod.GET)
	    public ModelAndView findAll() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("title", "tittel");
			mv.addObject("message", "moinsen");
			mv.setViewName("vv");
			return mv;
	    }
	
	
	
}