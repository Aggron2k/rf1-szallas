package com.example.szallas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "accomodation_host")
@Getter
@Setter
public class AccomodationHost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;
}
