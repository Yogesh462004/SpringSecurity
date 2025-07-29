package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Con1 {
	@GetMapping("/hello")
  public String he() {
	  return "Hello YOGESH";
  }
	@GetMapping("/hi")
	public String hu() {
		return "Hi Yogesh";
	}
}
