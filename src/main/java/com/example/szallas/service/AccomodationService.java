package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.repository.AccomodationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class AccomodationService{
    private final AccomodationRepository accomodationRepository;

    public AccomodationService(AccomodationRepository accomodationRepository) {
        this.accomodationRepository = accomodationRepository;
    }


    public List<Accomodation> searchSzallas(SearchRequest searchRequest) {
        return accomodationRepository.findByElerhetoSzallasok(searchRequest.getCheck_in(),searchRequest.getCheck_out(), Integer.parseInt(searchRequest.getNumberOfPerson()), searchRequest.getHova());
    }
}
