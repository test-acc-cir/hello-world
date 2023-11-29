package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
	
	@GetMapping(value = "/hello", produces = {"application/json"})
	public String helloWorld() {
		return "Hello world";
	}

}
