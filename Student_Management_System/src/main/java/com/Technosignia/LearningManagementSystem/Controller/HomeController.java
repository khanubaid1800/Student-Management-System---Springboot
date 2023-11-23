package com.Technosignia.LearningManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
	@GetMapping("/Home")
	public String welcome()
	{
		return "Welcome to SpringBoot,Ubaid";
	}
	
	
	

}
