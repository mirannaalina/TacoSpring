package com.learning.learnspring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                 //controller
public class HomeController {

    @GetMapping("/") //handles requests for the root path /
    public String home(){
        return"home"; //returns the view name
    }
}
