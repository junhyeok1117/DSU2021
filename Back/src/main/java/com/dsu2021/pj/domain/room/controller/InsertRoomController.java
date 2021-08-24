package com.dsu2021.pj.domain.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
public class InsertRoomController {
	
	@Autowired
	private RoomService service;
	
	public ResponseEntity<?> insertRoom(){
		
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
