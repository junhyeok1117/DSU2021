package com.dsu2021.pj.domain.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dsu2021.pj.domain.reservation.service.ReservationService;
import com.dsu2021.pj.domain.user.dto.UserDto;

@CrossOrigin(origins="*")
@RestController
public class SearchReservationController{
	
	@Autowired
	private ReservationService service;
	
    //로그인 요청
    @GetMapping ("/reservations/{index}")
    public ResponseEntity<UserDto.UserCheckEmail> getReservationByIndex(@PathVariable("index") Long index) {
    	
    	service.getReservationByIndex(index);
    	
        return new ResponseEntity<UserDto.UserCheckEmail>(HttpStatus.OK);

    }
	
	
}
