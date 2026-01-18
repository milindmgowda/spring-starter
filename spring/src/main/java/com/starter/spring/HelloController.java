package com.starter.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot!");
        return "hello";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Spring Boot Application");
        return "hello";
    }
}
