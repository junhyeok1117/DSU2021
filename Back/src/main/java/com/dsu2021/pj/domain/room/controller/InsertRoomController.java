package com.dsu2021.pj.domain.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
public class InsertRoomController {
	
	@Autowired
	private RoomService service;
	
	
	@PostMapping("/rooms")
	public ResponseEntity<?> insertRoom(@RequestParam MultipartFile file,@RequestBody RoomDTO.RoomHostReq req){
		
		RoomDTO.RoomHostRes res =  service.insertRoom(req);
		
		if(res == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		return new ResponseEntity<>(res.getRoomIndex(),HttpStatus.OK);
	}
}
