package com.example.szallas.model;

public enum AccomodationType {
    APARTMAN("Apartman"),
    SZÁLLODA("Szálloda");

    private final String displayName;

    AccomodationType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
