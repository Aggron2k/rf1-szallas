package com.example.szallas.model;

import lombok.Getter;

@Getter
public enum ServiceOption {
    PARKOLAS("Parkolás"),
    INGYENES_WIFI("WiFi");
    private final String serviceName;

    ServiceOption(String serviceName) {
        this.serviceName = serviceName;
    }

}