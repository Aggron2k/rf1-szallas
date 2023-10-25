package com.example.szallas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "accomodation")
@Getter
@Setter
public class Accomodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    private AccomodationType type;
    private String name;
    private String description;
    private float langitude;
    private float longitude;

    @OneToMany(mappedBy = "accomodation", cascade = CascadeType.ALL)
    private List<Room> rooms;
}
