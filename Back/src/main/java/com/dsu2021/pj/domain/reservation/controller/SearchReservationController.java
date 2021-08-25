package com.dsu2021.pj.domain.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dsu2021.pj.domain.reservation.service.ReservationMapper;
import com.dsu2021.pj.domain.user.dto.UserDto;

@Service
public class SearchReservationController{
	
	@Autowired
	private ReservationMapper reservationMapper;
	
    //로그인 요청
    @GetMapping ("/reservations/{index}")
    public ResponseEntity<UserDto.UserCheckEmail> signIn(@PathVariable("index") Long index) {
    	
    	reservationMapper.getReservationByIndex(index);
    	
        return new ResponseEntity<UserDto.UserCheckEmail>( HttpStatus.OK);

    }
	
	
}
