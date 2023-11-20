package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.AccomodationHost;
import com.example.szallas.model.User;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.repository.AccomodationHostRepository;
import com.example.szallas.repository.AccomodationRepository;
import com.example.szallas.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccomodationService{
    private final AccomodationRepository accomodationRepository;
    private final AccomodationHostRepository accomodationHostRepository;
    private final UserRepository userRepository;

    public AccomodationService(AccomodationRepository accomodationRepository, AccomodationHostRepository accomodationHostRepository, UserRepository userRepository) {
        this.accomodationRepository = accomodationRepository;
        this.accomodationHostRepository = accomodationHostRepository;
        this.userRepository = userRepository;
    }

    public Accomodation getAccommodationById(int id) {
        Optional<Accomodation> optionalAccommodation = accomodationRepository.findById(id);
        return optionalAccommodation.orElse(null);
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

    public void addAccommodation(Accomodation accommodation) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByUsername(authentication.getName()).orElse(null);
        AccomodationHost accomodationHost = accomodationHostRepository.findByUserId(user.getId()).orElse(null);
        if(accomodationHost != null){
            accommodation.setAccomodationHost(accomodationHost);
            accomodationRepository.save(accommodation);
        }
    }

    public void modifyAccomodation(Accomodation accommodation) {
        System.out.println(accommodation.getId());
        // Ellenőrizd, hogy az adott id-jű szállás létezik-e az adatbázisban
        Accomodation existingAccommodation = accomodationRepository.findById(accommodation.getId())
                .orElseThrow(() -> new EntityNotFoundException("Szállás nem található azonosító alapján: " + accommodation.getId()));

        // A módosítandó adatok beállítása
        existingAccommodation.setCity(accommodation.getCity());
        existingAccommodation.setDescription(accommodation.getDescription());
        existingAccommodation.setHsz(accommodation.getHsz());
        existingAccommodation.setIrsz(accommodation.getIrsz());
        existingAccommodation.setLangitude(accommodation.getLangitude());
        existingAccommodation.setLongitude(accommodation.getLongitude());
        existingAccommodation.setName(accommodation.getName());
        existingAccommodation.setStreet(accommodation.getStreet());
        existingAccommodation.setType(accommodation.getType());

        // Módosítás mentése
        accomodationRepository.save(existingAccommodation);
    }

    public List<Accomodation> getSzallasok() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByUsername(authentication.getName()).orElse(null);
        if (user != null) {
            AccomodationHost accomodationHost = accomodationHostRepository.findByUserId(user.getId()).orElse(null);
            if (accomodationHost != null) {
                return accomodationRepository.findAllByAccomodationHostId(accomodationHost.getId());
            }
        }
        return new ArrayList<>();
    }

    public Accomodation getAccomodationById(Integer accomodationId) {
        return accomodationRepository.findById(accomodationId).orElse(null);
    }
    }
