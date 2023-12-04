package com.example.szallas.repository;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Rating;
import com.example.szallas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
    Optional<Rating> findByAccomodationAndUser(Accomodation accomodation, User user);
}
