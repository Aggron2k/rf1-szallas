package com.example.szallas.controller;

import com.example.szallas.model.User;
import com.example.szallas.model.request.RegistrationRequest;
import com.example.szallas.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

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

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return  "login";
    }

    @PostMapping("/loginRequest")
    public String loginRequest(){
        return "login";
    }

    @GetMapping("/user/profile")
    public String profilePage(){
        return "profile";
    }

    @PostMapping("/user/updateEmail")
    public String updateEmail(@RequestParam("newEmail") String newEmail) {
        User currentUser = userService.getCurrentLoggedInUser();

        currentUser.setEmail(newEmail);
        userService.updateUser(currentUser);

        return "redirect:/user/profile?success";
    }

    @PostMapping("/user/updatePassword")
    public String updatePassword(@RequestParam("password") String newPassword,
                                 @RequestParam("passwordre") String confirmNewPassword) {
        try {
            if (!newPassword.equals(confirmNewPassword)) {
                return "redirect:/user/profile?error=passwordMismatch";
            }

            User currentUser = userService.getCurrentLoggedInUser();

            currentUser.setPassword(passwordEncoder.encode(newPassword));
            userService.updateUser(currentUser);

            return "redirect:/user/profile?success";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/user/profile?error=unexpectedError";
        }
    }
}