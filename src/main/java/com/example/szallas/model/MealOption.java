package com.example.szallas.model;

import lombok.Getter;

@Getter
public enum MealOption {
    REGGELI("Reggeli az árban"),
    VACSORA("Vacsora az árban"),
    REGGELI_ES_VACSORA("Reggeli + Vacsora az árban"),
    NINCS_MEAL("Nincs étkezés az árban");

    private final String displayName;

    MealOption(String displayName) {
        this.displayName = displayName;
    }

}
