package com.springboot.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/str")
	public String returnString() {
		return "jenkins app working fine";
	}
	@GetMapping("/name")
	public String returnName() {
		return "Ganesh";
	}
}
