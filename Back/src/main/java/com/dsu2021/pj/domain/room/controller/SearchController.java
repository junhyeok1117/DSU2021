package com.dsu2021.pj.domain.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.room.dto.DetailRoomDTO;
import com.dsu2021.pj.domain.room.dto.SearchRoomRestDTO;
import com.dsu2021.pj.domain.room.dto.SearchedRoomDTO;
import com.dsu2021.pj.domain.room.entity.Room;
import com.dsu2021.pj.domain.room.service.RoomService;
import com.dsu2021.pj.domain.room.service.impl.RoomServiceImpl;

@CrossOrigin(origins="*")
@RestController
public class SearchController {
	
	@Autowired
	RoomService service;
	
	@GetMapping("/rooms")
    public ResponseEntity<List<SearchedRoomDTO>> searchRoom(SearchRoomRestDTO searchRoomRestDto){
        return service.searchRoom(searchRoomRestDto);
    }
	
	@GetMapping("/rooms/{room_index}")
    public ResponseEntity<DetailRoomDTO> getDetailRoom(@PathVariable("room_index") String room_index){
        return service.getDetailRoom(room_index);
    }
	
	@GetMapping("/testoo")
	public ResponseEntity<List<Room>> test(){
		return service.getAllRooms();
	}

}