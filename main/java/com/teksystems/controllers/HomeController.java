package com.teksystems.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HomeController {
	
	@RequestMapping("/")
	public String home() throws Exception{
		
		return("Welcome to the Home Page");
	}

}
