package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping
	@RequestMapping("/test")
	String hellworld(){
		
		return "hello";
	}
	
}