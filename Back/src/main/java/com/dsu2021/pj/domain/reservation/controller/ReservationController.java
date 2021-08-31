package com.dsu2021.pj.domain.reservation.controller;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dsu2021.pj.domain.reservation.service.ReservationService;
import com.dsu2021.pj.domain.user.dto.UserDto;

@CrossOrigin(origins="*")
@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
    //예약조회
//    @GetMapping ("/reservations/{index}")
//    public ResponseEntity<UserDto.UserCheckEmail> getReservationByIndex(@PathVariable("index") Long index) {
//
//    	service.getReservationByIndex(index);
//
//        return new ResponseEntity<UserDto.UserCheckEmail>(HttpStatus.OK);
//
//    }

    @PostMapping("/reservations")
    public ResponseEntity reservation(ReservationDto.ReservationReq reservationReq) {






        return null;
//        return new ResponseEntity()
    }
	
	
}
