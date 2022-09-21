package com.cristian.lil.sbet.bootingweb.service;


import com.cristian.lil.sbet.bootingweb.data.RoomRepository;
import com.cristian.lil.sbet.bootingweb.models.Room;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

}
