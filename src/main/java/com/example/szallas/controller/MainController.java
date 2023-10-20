package com.example.szallas.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String layout(){
        return "index";
    }
}