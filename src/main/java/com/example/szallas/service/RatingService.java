package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Rating;
import com.example.szallas.model.User;
import com.example.szallas.repository.AccomodationRepository;
import com.example.szallas.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private AccomodationRepository accomodationRepository;

    public Optional<Rating> findRatingByAccommodationAndUser(Integer accommodationId, User user) {
        Accomodation accommodation = new Accomodation();
        accommodation.setId(accommodationId);

        return ratingRepository.findByAccomodationAndUser(accommodation, user);
    }

    public void rateAccommodation(Integer accommodationId, int ratingValue, User user) {
        Accomodation accommodation = accomodationRepository.findById(accommodationId)
                .orElseThrow(() -> new RuntimeException("Accommodation not found with id: " + accommodationId));

        // Check if the user already rated this accommodation
        Optional<Rating> existingRating = ratingRepository.findByAccomodationAndUser(accommodation, user);

        if (existingRating.isPresent()) {
            // If the user already rated, update the rating value
            Rating rating = existingRating.get();
            rating.setValue(ratingValue);
            ratingRepository.save(rating);
        } else {
            // If the user hasn't rated yet, create a new rating and save it
            Rating newRating = new Rating();
            newRating.setAccomodation(accommodation);
            newRating.setUser(user);
            newRating.setValue(ratingValue);
            ratingRepository.save(newRating);
        }
    }
}
