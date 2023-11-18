package com.example.szallas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationController {

    @GetMapping("/reservations")
    public String showReservations() {
        return "reservation";
    }
}
