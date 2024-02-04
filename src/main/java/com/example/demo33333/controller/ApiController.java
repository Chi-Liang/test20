package com.example.demo33333.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	// TODO xxxxxxx
	@GetMapping("/test1")
	public String aa() {
		return "cccccccttt1556666666";
	}
	@GetMapping("/test11")
	public String aaa() {
		System.out.println("999999999666666666699999");
		return "aaaaaaaa";
	}

}
