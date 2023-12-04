package com.example.szallas.controller;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Rating;
import com.example.szallas.model.Room;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.service.AccomodationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class AccomodationController {
    private final AccomodationService accomodationService;

    public AccomodationController(AccomodationService accomodationService) {
        this.accomodationService = accomodationService;
    }

    @PostMapping("/search")
    public String searchAccomodation(@Valid @ModelAttribute("searchRequest") SearchRequest searchRequest, BindingResult result, Model model){
        if(result.hasErrors()){
            return "redirect:/";
        }
        List<Accomodation> szallasok = accomodationService.searchSzallas(searchRequest);
        System.out.println(szallasok);
        Map<Accomodation, Room> szallasLegolcsobbSzobaval = new HashMap<>();

        for (Accomodation szallas : szallasok) {
            Optional<Room> cheapestRoom = szallas.getRooms().stream()
                    .min(Comparator.comparing(Room::getPrice))
                    .stream()
                    .findFirst();
            cheapestRoom.ifPresent(room -> szallasLegolcsobbSzobaval.put(szallas, room));
        }
        Long dasysBetween = ChronoUnit.DAYS.between(searchRequest.getCheck_in(), searchRequest.getCheck_out());
        model.addAttribute("search", searchRequest);
        model.addAttribute("napokSzama", Integer.parseInt(String.valueOf(dasysBetween)));
        model.addAttribute("szallasok", szallasLegolcsobbSzobaval);
        return "searchResult";
    }

    @GetMapping("/szallasAdmin")
    public String szallascrud(Model model){
        List<Accomodation> accomodations = accomodationService.getOsszesSzallas();
        model.addAttribute("accomodations", accomodations);
        return "szallasAdmin";
    }


    @GetMapping("/deleteSzallas/{id}")
    public String deleteSzallas(@PathVariable("id") int id) {
        System.out.println(id);
        accomodationService.deleteSzallasById(id);
        return "redirect:/szallasAdmin";
    }

    @GetMapping("/addAccomodation")
    public String showAddAccommodationForm(Model model) {
        model.addAttribute("accommodation", new Accomodation());
        return "addAccomodation";
    }

    @PostMapping("/addAccomodation")
    public String addAccommodation(@ModelAttribute Accomodation accommodation) {
        accomodationService.addAccommodation(accommodation);
        return "redirect:/szallasAdmin";
    }

    @GetMapping("/editAccomodation/{id}")
    public String showEditAccommodationForm(@PathVariable int id, Model model) {
        Accomodation accommodation = accomodationService.getAccommodationById(id);
        model.addAttribute("accommodation", accommodation);
        return "editAccomodation";
    }

    @PostMapping("/editAccomodation")
    public String modifyAccomodation(@ModelAttribute Accomodation accommodation) {
        System.out.println("Modify Accomodation method is called!");
        accomodationService.modifyAccomodation(accommodation);
        return "redirect:/szallasAdmin";
    }

    @GetMapping("/accomodation/{accomodationId}")
    public String accomodationDetail(@PathVariable Integer accomodationId, Model model) {
        Accomodation accomodation = accomodationService.getAccomodationById(accomodationId);
        if (accomodation == null) {
            return "redirect:/";
        }
        System.out.println(accomodation.getImages());
        model.addAttribute("accommodation", accomodation);
        return "accDetail";
    }
    @GetMapping("/rateAccomodation/{id}")
    public String showRateAccommodationForm(@PathVariable int id, Model model) {
        Accomodation accommodation = accomodationService.getAccommodationById(id);
        model.addAttribute("accommodation", accommodation);
        model.addAttribute("rating", new Rating()); // Új értékelés létrehozása
        return "rateAccomodation";
    }

    @PostMapping("/rateAccomodation/{id}")
    public String rateAccommodation(@PathVariable int id, @ModelAttribute Rating rating) {
        Accomodation accommodation = accomodationService.getAccommodationById(id);
        rating.setAccomodation(accommodation);
        accommodation.getRatings().add(rating);
        accomodationService.modifyAccomodation(accommodation);
        return "redirect:/accomodation/" + id;
    }

}
