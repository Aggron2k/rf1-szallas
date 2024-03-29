package com.example.szallas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "images")
@Getter
@Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Lob
    @Column(length = Integer.MAX_VALUE)
    private byte[] image;

    @ManyToOne
    private Accomodation accomodation;
}
