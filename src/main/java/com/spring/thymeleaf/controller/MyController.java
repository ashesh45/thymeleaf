package com.spring.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/about")
	public String about(Model model)
	{
		System.out.println("Inside the Kathmandu valley");
		
		//putting data in model
		model.addAttribute("name","Ashesh");
		return "about";
	}
	
	//handling iteration
	@GetMapping("/loop")
	public String iterateHandler(Model m) {
		
		//create a list
	   List<String>names = List.of("Ashesh", "Laxmi","Bijay","sahil");
	   m.addAttribute("names",names);
		return "iterate";
	}

}
