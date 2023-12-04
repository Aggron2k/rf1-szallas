package com.example.szallas.controller;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Image;
import com.example.szallas.model.Rating;
import com.example.szallas.model.Room;
import com.example.szallas.model.request.ReszletesKereses;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.service.AccomodationService;
import com.example.szallas.service.ImageService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Controller
public class AccomodationController {
    private final AccomodationService accomodationService;
    private final ImageService imageService;

    public AccomodationController(AccomodationService accomodationService, ImageService imageService) {
        this.accomodationService = accomodationService;
        this.imageService = imageService;
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
        ReszletesKereses reszletesKereses = new ReszletesKereses();
        reszletesKereses.setHova(searchRequest.getHova());
        reszletesKereses.setCheck_out(searchRequest.getCheck_out());
        reszletesKereses.setCheck_in(searchRequest.getCheck_in());
        reszletesKereses.setNumberOfPerson(Integer.valueOf(searchRequest.getNumberOfPerson()));
        model.addAttribute("search", searchRequest);
        model.addAttribute("reszletesKereses", reszletesKereses);
        model.addAttribute("napokSzama", Integer.parseInt(String.valueOf(dasysBetween)));
        model.addAttribute("szallasok", szallasLegolcsobbSzobaval);
        return "searchResult";
    }

    @PostMapping("/reszletesKereses")
    public String reszletesKereses(@ModelAttribute("reszletesKereses") ReszletesKereses reszletesKereses, BindingResult result, Model model){
        if(result.hasErrors()){
            return "redirect:/";
        }
        SearchRequest request = new SearchRequest();
        request.setCheck_in(reszletesKereses.getCheck_in());
        request.setCheck_out(reszletesKereses.getCheck_out());
        request.setHova(reszletesKereses.getHova());
        request.setNumberOfPerson(String.valueOf(reszletesKereses.getNumberOfPerson()));
        List<Accomodation> szallasok = accomodationService.searchSzallas(request);
        System.out.println("RÉSZLETES KERESÉS: " + reszletesKereses);
        Map<Accomodation, Room> szallasLegolcsobbSzobaval = new HashMap<>();

        for (Accomodation szallas : szallasok) {
            Optional<Room> cheapestRoom = szallas.getRooms().stream()
                    .min(Comparator.comparing(Room::getPrice))
                    .stream()
                    .findFirst();
            cheapestRoom.ifPresent(room -> szallasLegolcsobbSzobaval.put(szallas, room));
        }

        Map<Accomodation, Room> filteredMap = filterByValue(szallasLegolcsobbSzobaval, value -> value.getAccomodation().isParkolas() == reszletesKereses.isParkolas() || value.getAccomodation().isWifi() == reszletesKereses.isWifi() || value.getAccomodation().isTeljesEllatas() == reszletesKereses.isTeljesELlatas() || value.getAccomodation().isFelpanzio() == reszletesKereses.isFelEllatas());

        //Long dasysBetween = ChronoUnit.DAYS.between(reszletesKereses.getCheck_in(), reszletesKereses.getCheck_out());
        model.addAttribute("search", reszletesKereses);
        model.addAttribute("reszletesKereses", reszletesKereses);
        model.addAttribute("napokSzama", 3);
        model.addAttribute("szallasok", reszletesKereses.isWifi() || reszletesKereses.isParkolas() || reszletesKereses.isFelEllatas() || reszletesKereses.isTeljesELlatas() ? filteredMap : szallasLegolcsobbSzobaval);
        return "searchResult";
    }
    static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(entry -> predicate.test(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
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

    @GetMapping("/display")
    public ResponseEntity<byte[]> displayImage(@RequestParam("id") Integer id) throws IOException, SQLException
    {
        Image image = imageService.getImageById(id);
        byte [] imageBytes = image.getImage();
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }

}
