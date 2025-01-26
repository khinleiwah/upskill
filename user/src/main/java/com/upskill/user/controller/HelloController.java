package com.upskill.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		return "Hello World ";
	}
	
//	@GetMapping("about")
//	public String about(HttpServletRequest request) {
//		return "Telusko "+request.getSession().getId();
//	}
}
