package com.example.szallas.controller;

import com.example.szallas.service.ReservationService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.szallas.model.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public String showAllReservations(Model model) {
        List<Reservation> reservations = reservationService.getAllReservations();
        model.addAttribute("reservations", reservations);
        return "reservation";
    }

    @GetMapping("/reservations/{id}")
    public String showReservationDetails(@PathVariable Long id, Model model) {
        Optional<Reservation> reservation = reservationService.getReservationById(id);
        model.addAttribute("reservation", reservation.orElse(null));
        return "reservation";
    }

    @GetMapping("/reservation")
    public String showReservationPage(Model model) {
        return "reservation";
    }

    @PostMapping("/reservation/new")
    public String processReservationForm(@ModelAttribute Reservation reservation) {
        reservationService.saveReservation(reservation);
        return "redirect:/reservations";
    }

    @GetMapping("/reservation/delete/{id}")
    public String deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
        return "redirect:/reservations";
    }


    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation/create";
    }

    @GetMapping("/reservation/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Reservation> reservation = reservationService.getReservationById(id);
        if (reservation.isPresent()) {
            model.addAttribute("reservationToEdit", reservation.get());
            model.addAttribute("reservation", new Reservation()); // Üres objektum hozzáadása
            return "reservation";
        } else {
            return "redirect:/reservation"; // Visszairányítás, ha a foglalás nem található
        }
    }

    @PostMapping("/reservation/save")
    public String saveReservation(@ModelAttribute Reservation reservation) {
        reservationService.saveReservation(reservation);
        return "redirect:/reservations"; // Az átirányítás a foglalások listájára
    }

}