package com.example.demo33333.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/test1")
	public String aa() {
		return "aaaaaaaa";
	}
	
}
