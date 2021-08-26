package com.dsu2021.pj.domain.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
public class SearchRoomController {
	
	@Autowired
	private RoomService service;
	
	@GetMapping("/rooms/page/{page}")
    public ResponseEntity<List<RoomDTO.RoomRes>> getRoomsByPage(@PathVariable("page") Integer page, @ModelAttribute RoomDTO.RoomReq req){
        
		List<RoomDTO.RoomRes> rooms;
		
		rooms = service.search15Rooms(page,req);
		
		return new ResponseEntity<>(rooms,HttpStatus.OK);
    }
	
	@GetMapping("/rooms/{roomIndex}")
    public ResponseEntity<RoomDTO.RoomRes> getRoom(@PathVariable("roomIndex") Long roomIndex){
		
		RoomDTO.RoomRes room = service.getRoomByIndex(roomIndex);
		
		return new ResponseEntity<>(room,HttpStatus.OK);
    }
	

}