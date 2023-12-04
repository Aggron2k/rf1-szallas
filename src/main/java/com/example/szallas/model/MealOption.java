package com.example.szallas.model;

import lombok.Getter;

@Getter
public enum MealOption {
    TELJES("Teljes panzió"),
    FEL("Fél panzió");
    private final String displayName;

    MealOption(String displayName) {
        this.displayName = displayName;
    }

}
