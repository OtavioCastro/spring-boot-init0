package br.com.springbootinit0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarroController {

	
	@GetMapping("/formCarros")
	public String teste() {
		return "formCarros";
	}
	
}
