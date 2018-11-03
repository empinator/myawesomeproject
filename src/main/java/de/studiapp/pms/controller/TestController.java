package de.studiapp.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	
	@GetMapping
	public String getTestData(Model model) {
		model.addAttribute("data", "Welcome home man");
		return "welcome";
		
	}
	
}
