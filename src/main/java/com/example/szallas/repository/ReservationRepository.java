package com.example.szallas.repository;

import com.example.szallas.model.Reservation;
import com.example.szallas.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
