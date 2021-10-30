package it.movie.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeController {

	@ResponseBody
	@GetMapping("/testprova")
	public String test() {
		return "Test sul controller!";
	}
	
	@GetMapping("/prova")
	public String index() {
		return "index";
	}
	

}
