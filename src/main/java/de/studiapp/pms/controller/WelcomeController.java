package de.studiapp.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("title", "Herzlich Willkommen!");
		model.addAttribute("message", "Sie können hier Boote bzw. Personen anlegen und Fahrten absolvieren.");
		return "home";
	}
}