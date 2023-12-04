package com.example.szallas.controller;

import ch.qos.logback.core.model.Model;
import com.example.szallas.model.Rating;
import com.example.szallas.model.User;
import com.example.szallas.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/rateAccommodation/{accommodationId}")
    public String rateAccommodation(@PathVariable Integer accommodationId,
                                    @RequestParam int ratingValue,
                                    @AuthenticationPrincipal User user) {
        ratingService.rateAccommodation(accommodationId, ratingValue, user);
        // Redirect back to the page or display a success message
        return "redirect:/accommodation/search"; // Update the redirect URL as needed
    }

    @GetMapping("/showRating")
    public ModelAndView showRating(@RequestParam Integer accommodationId, @AuthenticationPrincipal User user) {
        ModelAndView modelAndView = new ModelAndView("showRatingPage");

        Optional<Rating> existingRating = ratingService.findRatingByAccommodationAndUser(accommodationId, user);

        if (existingRating.isPresent()) {
            modelAndView.addObject("hasRated", true);
            modelAndView.addObject("existingRating", existingRating.get().getValue());
        } else {
            modelAndView.addObject("hasRated", false);
        }

        return modelAndView;
    }

}
