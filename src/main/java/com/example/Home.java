package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class Home {
    @GetMapping("/")
    public String greet (HttpServletRequest request){
        return "welcome to telusko !!!"+request.getSession().getId().toString();
    }
}
