package com.example.szallas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rating")
@Getter
@Setter
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "accomodation_id")
    @JsonIgnore
    private Accomodation accomodation;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Adjunk hozzá egy felhasználó mezőt a szavazások követéséhez

    private int value;
}
