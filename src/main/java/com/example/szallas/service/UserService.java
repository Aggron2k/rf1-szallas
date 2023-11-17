package com.example.szallas.service;

import com.example.szallas.model.User;
import com.example.szallas.model.request.RegistrationRequest;
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
    private PasswordEncoder passwordEncoder;
    public User registerUser(RegistrationRequest request){
        var user = new User(request.getUsername(), passwordEncoder.encode(request.getPassword()), request.getFirstName(), request.getLastName(), request.getEmail(), request.getRole());
        return userRepository.save(user);
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