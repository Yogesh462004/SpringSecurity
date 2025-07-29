package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/y")
public class Greetings {

    @GetMapping("/")
    public String welcomePage() {
        return "welcome";  // welcome.html
    }

    @GetMapping("/loginpage")
    public String loginPage() {
        return "login";  // login.html
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";  // home.html
    }

    @GetMapping("/error")
    public String errorPage() {
        return "error";  // error.html
    }
}
