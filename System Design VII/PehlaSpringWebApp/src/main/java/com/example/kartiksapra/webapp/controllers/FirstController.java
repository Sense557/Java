package com.example.kartiksapra.webapp.controllers;

import java.nio.file.Path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping
	public String getHelloSpringHomepage() {
		return "Hello Spring";
	}
	
	@GetMapping("search")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("searching")
	public String searchkro(@RequestParam(name = "q") String value) {
		return value;
	}
	
	@GetMapping("searchingpath/{celebrity_name}")
	public String searchkroPathVariable(@PathVariable(name = "celebrity_name") String value) {
		return value;
	}
	
	//localhost:8080/post
	@PostMapping(path = "post")
	public void postkaro() {
		System.out.println("Running post");
	}
}
