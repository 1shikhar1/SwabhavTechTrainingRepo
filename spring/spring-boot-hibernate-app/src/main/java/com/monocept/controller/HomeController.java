package com.monocept.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
	public HomeController() {
		System.out.println("Home controller created");
	}
	
	@GetMapping
	public String get() {
		return "Hello get";
	}
	
	@PostMapping
	public String post() {
		return "Hello post";
	}
	
	@PutMapping
	public String put() {
		return "Hello put";
	}
	
	@DeleteMapping
	public String delete() {
		return "Hello delete";
	}
}
