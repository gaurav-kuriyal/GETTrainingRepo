package com.coforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String sayHello() {
		System.out.println("hello");
		
		return "Helloo";
	}
}
