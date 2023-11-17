package com.example.szallas.controller;

import com.example.szallas.service.AccomodationService;
import com.example.szallas.service.ImageService;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@Controller
public class ImageController {
    private final ImageService imageService;
    private final AccomodationService accomodationService;

    public ImageController(ImageService imageService, AccomodationService accomodationService) {
        this.imageService = imageService;
        this.accomodationService = accomodationService;
    }

    @GetMapping("/uploadImage")
    public String uploadImagePage(Model model){
        model.addAttribute("accomodations", accomodationService.getSzallasok());
        return "imageUploadView";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile img, @RequestParam Integer accomodation) throws FileNotFoundException {
        String message = imageService.uploadImage(img, accomodation);
        return "redirect:/uploadImage?success=" + message;
    }
}
