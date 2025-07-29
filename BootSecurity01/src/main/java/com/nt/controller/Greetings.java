package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/y")
public class Greetings {
    @GetMapping("/hello")
	public String  get() {
		return "hello";
	}
}
