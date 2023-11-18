package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.repository.AccomodationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class AccomodationService{
    private final AccomodationRepository accomodationRepository;

    public AccomodationService(AccomodationRepository accomodationRepository) {
        this.accomodationRepository = accomodationRepository;
    }

    public Accomodation getAccommodationById(int id) {
        Optional<Accomodation> optionalAccommodation = accomodationRepository.findById(id);
        return optionalAccommodation.orElse(null);
    }

    public void modifyAccommodation(Accomodation modifiedAccommodation) {
        int accommodationId = modifiedAccommodation.getId();
        Accomodation existingAccommodation = accomodationRepository.findById(accommodationId).orElse(null);

        if (existingAccommodation != null) {
            // Módosítsd az adatokat a meglévő szállás alapján
            existingAccommodation.setName(modifiedAccommodation.getName());
            // Egyéb mezők módosítása...

            // Mentsd el a módosított szállást az adatbázisban
            accomodationRepository.save(existingAccommodation);
        }
    }

    public List<Accomodation> searchSzallas(SearchRequest searchRequest) {
        return accomodationRepository.findByElerhetoSzallasok(searchRequest.getCheck_in(),searchRequest.getCheck_out(), Integer.parseInt(searchRequest.getNumberOfPerson()), searchRequest.getHova());
    }

    public List<Accomodation> getOsszesSzallas() {
        return accomodationRepository.findAll();
    }


    public void deleteSzallasById(int id) {
        accomodationRepository.deleteById(id);
    }
}
