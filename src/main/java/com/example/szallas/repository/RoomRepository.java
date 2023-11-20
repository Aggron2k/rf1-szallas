package com.example.szallas.repository;

import com.example.szallas.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findAllByAccomodationId(Integer accomodationId);
}
