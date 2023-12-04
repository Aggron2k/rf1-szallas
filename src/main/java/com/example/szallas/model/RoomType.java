package com.example.szallas.model;

public enum RoomType {
    ALAP("Alap"),
    FRANCIAAGYAS("Franciaágyas"),
    CSALADI("Családi"),
    LUXUS("Luxus"),
    KETAGYAS("Kétágyas");

    private final String displayName;

    RoomType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
