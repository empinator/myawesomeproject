package de.studiapp.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	  @RequestMapping("/welcome")
	    public ModelAndView welcome() {

			ModelAndView mv = new ModelAndView();
			mv.addObject("title", "Herzlich Willkommen!");
			mv.addObject("message", "Sie können hier Boote bzw. Personen anlegen und Fahrten absolvieren.");
			mv.setViewName("home");
			return mv;
	    }
}