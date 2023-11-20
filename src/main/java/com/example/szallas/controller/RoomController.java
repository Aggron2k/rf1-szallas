package com.example.szallas.controller;

import com.example.szallas.model.Room;
import com.example.szallas.model.RoomType;
import com.example.szallas.model.request.RegistrationRequest;
import com.example.szallas.service.RoomService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;


@Controller
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/rooms/{accomodationId}")
    public String showRoomsView(@PathVariable Integer accomodationId, Model model){
        List<Room> roomList = roomService.findAccomodationRooms(accomodationId);
        model.addAttribute("rooms", roomList);
        model.addAttribute("accId", accomodationId);
        return "showRooms";
    }

    @GetMapping("/addRoom/{accId}")
    public String addRoom(@PathVariable Integer accId, Model model){
        model.addAttribute("room", new Room());
        model.addAttribute("accId", accId);
        return "addRoom";
    }

    @PostMapping("/addRoomRequest/{accId}")
    public String register(@Valid @ModelAttribute("room") Room room, BindingResult bindingResult, Model model, @PathVariable Integer accId){
        System.out.println(bindingResult.getAllErrors());
        if(bindingResult.hasErrors()){
            return "redirect:/addRoom/" + accId;
        }
        roomService.newRoom(room, accId);
        return "redirect:/addRoom/" + accId + "?success";
    }

    @GetMapping("/room/delete/{id}/{accId}")
    public String deleteSzallas(@PathVariable("id") int id, @PathVariable int accId) {
        roomService.deleteRoom(id);
        return "redirect:/rooms/"+accId;
    }

    @GetMapping("/room/edit/{roomId}/{accId}")
    public String editRoomForm(@PathVariable Integer roomId, Model model, @PathVariable int accId){
        Optional<Room> room = roomService.getRoomById(roomId);
        model.addAttribute("room", room.get());
        model.addAttribute("roomId", room.get().getId());
        model.addAttribute("accId", accId);
        return "editRoom";
    }

    @PostMapping("/editRoomRequest/{roomId}/{accId}")
    public String editRoom(@Valid @ModelAttribute("room") Room room, BindingResult bindingResult, Model model, @PathVariable Integer roomId, @PathVariable Integer accId){
        System.out.println(bindingResult.getAllErrors());
        if(bindingResult.hasErrors()){
            return "redirect:/room/edit/"+ roomId + "/" + accId;
        }
        roomService.updateRoom(roomId,room);
        return "redirect:/rooms/" + accId + "?success";
    }
}
