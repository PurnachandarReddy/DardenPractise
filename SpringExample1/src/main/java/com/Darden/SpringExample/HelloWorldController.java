package com.Darden.SpringExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!!!...";
		
		
	}

}
