package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Rating;
import com.example.szallas.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getRatingsByAccommodationId(Long accommodationId) {
        return ratingRepository.findByAccommodationId(accommodationId);
    }

    public void rateAccommodation(int accommodationId, int ratingValue) {
        Rating rating = new Rating();
        Accomodation accommodation = new Accomodation();
        accommodation.setId(accommodationId);
        rating.setAccomodation(accommodation);
        rating.setValue(ratingValue);
        ratingRepository.save(rating);
    }

}
