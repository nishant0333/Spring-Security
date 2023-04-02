package com.example.spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		
		return "<h1>Hi first spring security project</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		
		
		return "<h1>welcome User</h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		
		return "<h1>Welcome Admin</h1>";
	}
}
