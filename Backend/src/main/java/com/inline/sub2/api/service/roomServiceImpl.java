package com.inline.sub2.api.service;

import com.inline.sub2.db.entity.RoomEntity;
import com.inline.sub2.db.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roomServiceImpl implements  roomService{

    @Autowired
    RoomRepository RoomRepository;

    public void createtRoom(String roomName, Long officeId){
        RoomEntity roomEntity = new RoomEntity();

        roomEntity.setRoomName(roomName);
        roomEntity.setOfficeId(officeId);
        RoomRepository.save(roomEntity);
    }
}