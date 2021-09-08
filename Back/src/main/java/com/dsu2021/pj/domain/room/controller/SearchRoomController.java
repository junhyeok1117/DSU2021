package com.dsu2021.pj.domain.room.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dsu2021.pj.domain.room.dto.RoomDTO;
import com.dsu2021.pj.domain.room.dto.TestDTO;
import com.dsu2021.pj.domain.room.service.RoomService;

@CrossOrigin(origins="*")
@RestController
public class SearchRoomController {
	
	@Autowired
	private RoomService service;
	
	@GetMapping("/rooms/page/{page}")
    public ResponseEntity<List<RoomDTO.RoomRes>> getRoomsByPage(@PathVariable("page") Integer page, @ModelAttribute RoomDTO.RoomReq req) throws Exception {
        
		List<RoomDTO.RoomRes> rooms;
		
		rooms = service.search15Rooms(page,req);
		
		return new ResponseEntity<>(rooms,HttpStatus.OK);
    }
	
	@GetMapping("/rooms/{roomIndex}")
    public ResponseEntity<RoomDTO.RoomRes> getRoom(@PathVariable("roomIndex") Long roomIndex){
		
		RoomDTO.RoomRes room = service.getRoomByIndex(roomIndex);
		
		return new ResponseEntity<>(room,HttpStatus.OK);
    }
	
	@GetMapping("/rooms/{roomIndex}/unavailable-dates")
	public ResponseEntity<Date[]> getUnAvailableDatesByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		
		
		Date[] dates = service.getUnAvailableDatesByRoomIndex(roomIndex);
		
		return new ResponseEntity<>(dates,HttpStatus.OK);
	}
	
	@GetMapping("/rooms/{roomIndex}/information")
	public ResponseEntity<RoomDTO.RoomInformationRes> getInformationByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		
		return new ResponseEntity<>(service.getInformationByRoomIndex(roomIndex),HttpStatus.OK);
	}
	
	@GetMapping("/rooms/{roomIndex}/facility")
	public ResponseEntity<RoomDTO.RoomFacilityRes> getFacilityByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		
		return new ResponseEntity<>(service.getFacilityByRoomIndex(roomIndex),HttpStatus.OK);
	}
	
	@GetMapping("/rooms/{roomIndex}/images")
	public ResponseEntity<RoomDTO.RoomFacilityRes> getImagesByRoomIndex(@PathVariable("roomIndex") Long roomIndex){
		
		return new ResponseEntity<>(service.getImagesByRoomIndex(roomIndex),HttpStatus.OK);
	}
	
	@GetMapping("/rooms/addresses/{roomAddressIndex}")
	public ResponseEntity<RoomDTO.RoomAddressRes> getAddressByRoomAddressIndex(@PathVariable("roomAddressIndex") Long roomAddressIndex){
		return new ResponseEntity<>(service.getAddressByRoomAddressIndex(roomAddressIndex),HttpStatus.OK);
	}
	
	@GetMapping("/categories/{categoryIndex}")
	public ResponseEntity<RoomDTO.RoomCategoryRes> getCategoryByCategoryIndex(@PathVariable("categoryIndex") Long categoryIndex){
		return new ResponseEntity<>(service.getCategoryByCategoryIndex(categoryIndex),HttpStatus.OK);
	}
	
//	@GetMapping("/ttt")
//	public TestDTO[] test(@ModelAttribute Date a,@ModelAttribute Date b ){
//		System.out.println(a+"일겁ㄴ디ㅏ");
//		System.out.println(b);
//		System.out.println(service.test(a,b)[0]);
//		System.out.println(service.test(a,b)[1]);
//		return service.test(a,b);
//	}
//	@GetMapping("/insertTest")
//	public void tesssst(@RequestBody TestDTO sss){
//		System.out.println(sss);
//		service.tet(sss);
//		return;
//	}
	
	

}