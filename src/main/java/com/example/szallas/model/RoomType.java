package com.example.szallas.model;

public enum RoomType {
    ALAP("Alap"),
    FRANCIAÁGYAS("Franciaágyas"),
    CSALÁDI("Családi"),
    LUXUS("Luxus"),
    KÉTÁGYAS("Kétágyas");

    private final String displayName;

    RoomType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
