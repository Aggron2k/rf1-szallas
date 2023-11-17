package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.AccomodationHost;
import com.example.szallas.model.User;
import com.example.szallas.model.request.SearchRequest;
import com.example.szallas.repository.AccomodationHostRepository;
import com.example.szallas.repository.AccomodationRepository;
import com.example.szallas.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Accomodation> searchSzallas(SearchRequest searchRequest) {
        return accomodationRepository.findByElerhetoSzallasok(searchRequest.getCheck_in(),searchRequest.getCheck_out(), Integer.parseInt(searchRequest.getNumberOfPerson()), searchRequest.getHova());
    }

    public List<Accomodation> getSzallasok(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByUsername(authentication.getName()).orElse(null);
        if(user != null){
            AccomodationHost accomodationHost = accomodationHostRepository.findByUserId(user.getId()).orElse(null);
            if(accomodationHost != null){
                return accomodationRepository.findAllByAccomodationHostId(accomodationHost.getId());
            }
        }
        return new ArrayList<>();
    }

    public Accomodation getAccomodationById(Integer accomodationId) {
        return accomodationRepository.findById(accomodationId).orElse(null);
    }
}
