package com.dsu2021.pj.domain.room.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsu2021.pj.domain.room.dto.RoomDTO;
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
	
	@DeleteMapping("/rooms/{roomIndex}/unavailable-date")
	public ResponseEntity<RoomDTO.RoomAddressRes> deleteUnAvailableDateByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		service.deleteUnAvailableDateByRoomIndex(roomIndex);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/rooms/{roomIndex}/unavailable-date/date/{inputDate}")
	public ResponseEntity<RoomDTO.RoomAddressRes> deleteUnAvailableDateByRoomIndexAndInputDate(@PathVariable("roomIndex") Long roomIndex,@PathVariable("inputDate") String inputDate){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse(inputDate);
			date = new Date(date.getTime() + 1000*60*60*9);
			service.deleteUnAvailableDateByRoomIndexAndInputDate(roomIndex,date);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (ParseException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
