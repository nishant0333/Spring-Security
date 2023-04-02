package com.example.springsecurityjDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "<h1>welcome home</h1>";
	}
	
	
	@GetMapping("/user")
	public String user() {
		
		return "<h1>welcome user</h1>";
	}
	
	
	@GetMapping("/admin")
	public String Admin() {
		
		return "<h1>welcome Admin</h1>";
	}
}
