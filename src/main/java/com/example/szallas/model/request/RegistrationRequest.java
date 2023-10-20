package com.example.szallas.model.request;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegistrationRequest {
    @NotEmpty(message = "A vezetéknév megadása kötelező.")
    private String firstName;
    @NotEmpty(message = "A keresztnév megadása kötelező.")
    private String lastName;
    @NotEmpty(message = "Az email cím megadása kötelező.")
    @Email(message = "Hibás email formátum.")
    private String email;
    @NotEmpty(message = "A jelszó megadása kötelező.")
    @Size(min = 6, message = "A jelszó minimum 6 karakter hosszú kell, hogy legyen.")
    private String password;
    @NotEmpty(message = "A felhasználónév megadása kötelező.")
    private String username;
    @NotEmpty(message = "A jogosultság megadása kötelező.")
    @Pattern(regexp = "^(GUEST|ACCOMODATION)$",message = "A jogosultság vagy GUEST vagy ACCOMODATION lehet.")
    private String role;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}