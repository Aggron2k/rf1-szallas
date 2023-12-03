package com.example.szallas.repository;

import com.example.szallas.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByAccommodationId(Long accommodationId);
}
