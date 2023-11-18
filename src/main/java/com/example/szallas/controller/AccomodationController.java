package com.example.szallas.controller;

import com.example.szallas.model.Accomodation;
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
        System.out.println(result.getAllErrors().toString());
        if(result.hasErrors()){
            //Itt nem tudom hova kell irányítani. a header.html be van a form.
            return "searchResult";
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
}
