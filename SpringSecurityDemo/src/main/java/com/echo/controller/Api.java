package com.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	@GetMapping("/test")
	public String test(){
		return "Hello";
	}
}