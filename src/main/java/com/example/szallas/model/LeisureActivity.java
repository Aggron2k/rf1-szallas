package com.example.szallas.model;

import lombok.Getter;

@Getter
public enum LeisureActivity {
    TURAZAS("Túrázás"),
    VIZIPARK("Vízipark"),
    VAROSNEZO_SETA("Városnéző séta"),
    JATSZOTER("Játszótér"),
    SZAUNA("Szauna");

    private final String displayName;

    LeisureActivity(String displayName) {
        this.displayName = displayName;
    }

}