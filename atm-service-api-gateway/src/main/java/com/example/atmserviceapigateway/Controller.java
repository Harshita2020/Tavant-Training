package com.example.atmserviceapigateway;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	
	@GetMapping("/actuator/info")
	public String PrintInfo() {
		return "This is Atm server Controller";
	}
}
