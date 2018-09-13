package be.vdab.proefpakket.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	private static final String VIEW = "index";
	private static final String ALFABETSTRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final char[] ALFABET = ALFABETSTRING.toCharArray();

	@GetMapping
	ModelAndView index() {
		return new ModelAndView(VIEW).addObject("alfabet", ALFABET);
	}
	
	
}
