package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class GreetingController {

    @GetMapping("/app")
    @ResponseBody
    public String getGreeting() {
        return "Hello world 27";
    }
}