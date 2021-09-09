package com.dsu2021.pj.domain.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
public class DeleteRoomController {
	
	@Autowired
	private RoomService service;
			
	@DeleteMapping("/rooms/{roomIndex}")
	public ResponseEntity<?> deleteRoom(@PathVariable Long roomIndex){
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	


}
