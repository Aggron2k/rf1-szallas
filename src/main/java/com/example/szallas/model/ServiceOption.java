package com.example.szallas.model;

import lombok.Getter;

@Getter
public enum ServiceOption {
    PARKOLAS("Parkolás"),
    INGYENES_WIFI("WiFi"),
    ETTEREM("Étterem"),
    KISALLAT_BEVIHETO("Kisállat bevihető"),
    SZOBASZERVIZ("Szobaszerviz"),
    EJJELNAPPALI_RECEPCIO("Éjjel-Nappali Recepció"),
    FITNESZKOZPONT("Fitneszközpont"),
    NEMDOHANYZO_SZOBAK("Nemdohányzó szobák"),
    REPTERI_TRANSZFER("Reptéri transzfer"),
    AKADALYMENTESITETT("Akadálymentesített"),
    CSALADI_SZOBAK("Családi szobák"),
    WELLNESSKOZPONT("Wellnessközpont"),
    ELEKTROMOS_JARMU_TOLTOPONT("Elektromos jármű töltőpont"),
    USZOMEDENCE("Úszómedence");

    private final String serviceName;

    ServiceOption(String serviceName) {
        this.serviceName = serviceName;
    }

}