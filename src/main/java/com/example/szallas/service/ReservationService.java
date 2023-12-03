package com.example.szallas.service;
import com.example.szallas.model.Reservation;
import com.example.szallas.model.request.ReservationRequest;
import com.example.szallas.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return reservationRepository.findAllByCustomerUserUsername(username);
    }

    public Optional<Reservation> getReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    public void saveReservation(ReservationRequest reservation) {
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
