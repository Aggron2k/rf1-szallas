package com.example.szallas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String irsz;
    private String city;
    private String street;
    private String hsz;
    private String description;
    private float langitude;
    private float longitude;
    @Column(name = "teljesEllatas", columnDefinition = "TINYINT DEFAULT 0")
    private boolean teljesEllatas;
    @Column(name = "wifi", columnDefinition = "TINYINT DEFAULT 0")
    private boolean wifi;
    @Column(name = "parkolas", columnDefinition = "TINYINT DEFAULT 0")
    private boolean parkolas;
    @Column(name = "felpanzio", columnDefinition = "TINYINT DEFAULT 0")
    private boolean felpanzio;

    @OneToMany(mappedBy = "accomodation", cascade = CascadeType.ALL)
    private List<Room> rooms;

    @OneToMany(mappedBy = "accomodation")
    private List<Reservation> reservations;

    @ManyToOne
    private AccomodationHost accomodationHost;
    @OneToMany(mappedBy = "accomodation")
    @JsonIgnore
    private List<Image> images;
    @OneToMany(mappedBy = "accomodation")
    private List<Rating> ratings;
}
