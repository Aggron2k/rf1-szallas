package com.example.szallas.model;

import jakarta.persistence.*;
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

    private int capacity;
    private int price;
    private int room_number;

    @ManyToOne
    private Accomodation accomodation;
}
