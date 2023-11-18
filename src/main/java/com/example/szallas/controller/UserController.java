package com.example.szallas.controller;

import com.example.szallas.model.User;
import com.example.szallas.model.request.RegistrationRequest;
import com.example.szallas.repository.UserRepository;
import com.example.szallas.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

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
    public String profilePage(Model model){
        try {
            User currentUser = userService.getCurrentLoggedInUser();
            model.addAttribute("currentUser", currentUser);
            return "profile";
        } catch (UsernameNotFoundException e) {
            return "error";
        }
    }

    @PostMapping("/user/updateName")
    public String updateName(@RequestParam("first_name") String firstName,
                             @RequestParam("last_name") String lastName) {
        try {
            User currentUser = userService.getCurrentLoggedInUser();

            currentUser.setFirstName(firstName);
            currentUser.setLastName(lastName);

            userService.updateUser(currentUser);

            return "redirect:/user/profile?success";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/user/profile?error=valamihiba";
        }
    }

    @PostMapping("/user/updateUsername")
    public String updateUsername(@RequestParam("newUsername") String newUsername) {
        try {
            User currentUser = userService.getCurrentLoggedInUser();

            currentUser.setUsername(newUsername);
            userService.updateUser(currentUser);

            return "redirect:/user/profile?success";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/user/profile?error=unexpectedError";
        }
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

    @PostMapping("/user/delete")
    public String deleteUser() {
        try {
            // Get the currently logged-in user
            User currentUser = userService.getCurrentLoggedInUser();

            // Töröld a felhasználót
            userRepository.delete(currentUser);

            return "redirect:/logout"; // Példa: kijelentkeztetés a törlés után
        } catch (Exception e) {
            // Kezeld a törlés közbeni hibákat
            e.printStackTrace(); // Az egyszerűség kedvéért a konzolra írjuk ki
            return "redirect:/user/profile?error=deleteError";
        }
    }
}