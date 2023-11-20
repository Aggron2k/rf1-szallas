package com.example.szallas.service;

import com.example.szallas.model.Accomodation;
import com.example.szallas.model.Room;
import com.example.szallas.repository.AccomodationRepository;
import com.example.szallas.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    private final AccomodationRepository accomodationRepository;

    public RoomService(RoomRepository roomRepository, AccomodationRepository accomodationRepository) {
        this.roomRepository = roomRepository;
        this.accomodationRepository = accomodationRepository;
    }

    public List<Room> findAccomodationRooms(Integer accomodationId) {
        return roomRepository.findAllByAccomodationId(accomodationId);
    }

    public void newRoom(Room room, Integer accId) {
        Accomodation accomodation = accomodationRepository.findById(accId).orElse(null);
        if(accomodation != null){
            room.setAccomodation(accomodation);
            roomRepository.save(room);
        }
    }

    public void deleteRoom(int id) {
        Room room = roomRepository.findById(id).orElse(null);
        if(room != null){
            roomRepository.delete(room);
        }
    }

    public Optional<Room> getRoomById(Integer roomId) {
        return roomRepository.findById(roomId);
    }

    public void updateRoom(Integer roomId, Room room) {
        Room room1 = roomRepository.findById(roomId).orElse(null);
        if(room1 != null){
            room1.setRoom_number(room.getRoom_number());
            room1.setPrice(room.getPrice());
            room1.setType(room.getType());
            room1.setCapacity(room.getCapacity());
            roomRepository.save(room1);
        }
    }
}
