package com.example.szallas.service;

import com.example.szallas.model.AccomodationHost;
import com.example.szallas.model.Customer;
import com.example.szallas.model.User;
import com.example.szallas.model.request.RegistrationRequest;
import com.example.szallas.repository.AccomodationHostRepository;
import com.example.szallas.repository.CustomerRepository;
import com.example.szallas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccomodationHostRepository accomodationHostRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public User registerUser(RegistrationRequest request){
        var user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()), request.getFirstName(), request.getLastName(), request.getEmail(), request.getRole());
        userRepository.save(user);
        if(request.getRole().equals("GUEST")){
            Customer customer = new Customer();
            customer.setUser(user);
            customerRepository.save(customer);
        }else{
            AccomodationHost accomodationHost =  new AccomodationHost();
            accomodationHost.setUser(user);
            accomodationHostRepository.save(accomodationHost);
        }
        return user;
    }

    public User getCurrentLoggedInUser() {
        // Get the username of the currently logged-in user
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Nincs ilyen felhasználó: " + username));
        }

        throw new UsernameNotFoundException("User nem található");
    }

    public User updateUser(User currentUser) {
        return userRepository.save(currentUser);
    }
}