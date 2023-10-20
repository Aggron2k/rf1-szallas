package com.example.szallas.controller;

import com.example.szallas.model.User;
import com.example.szallas.model.request.RegistrationRequest;
import com.example.szallas.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new RegistrationRequest());
        return "registration";
    }

    @PostMapping("/registerRequest")
    public String register(@Valid @ModelAttribute("user") RegistrationRequest registrationRequest, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "registration";
        }
        userService.registerUser(registrationRequest);
        return "redirect:/register?success";
    }
}