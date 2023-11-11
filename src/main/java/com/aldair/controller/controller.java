package com.aldair.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
	@GetMapping("/saludo")
	public String saludo(@RequestParam(name="mensaje",required = false,defaultValue = "Hola") String name, Model model) {
		model.addAttribute("mensaje",name);
		return "saludo";
	}
}
