package com.example.szallas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    private RoomType type;
    @NotNull(message = "A férőhely megadása kötelező")
    private int capacity;
    @NotNull(message = "Az ár megadása kötelező")
    private int price;
    @NotNull(message = "A szobaszám megadása kötelező")
    private int room_number;

    @ManyToOne
    private Accomodation accomodation;
}
