package com.dsu2021.pj.domain.reservation.controller;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dsu2021.pj.domain.reservation.service.ReservationService;
import com.dsu2021.pj.domain.user.dto.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
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


    //예약요청
    @PostMapping("/reservations/{roomIndex}")
    public ResponseEntity<ReservationDto.CheckDate> reservation(HttpServletRequest request, @PathVariable("roomIndex") Long roomIndex, @RequestBody ReservationDto.InsertReq insertReq) {

        HttpSession session = request.getSession();
        log.info((String) session.getAttribute("email"));

        String currentSession = (String) session.getAttribute("email");
        System.out.println("currentSession = " + currentSession);

        ReservationDto.CheckDate checkDate = service.reservation(roomIndex,insertReq,currentSession);

        return new ResponseEntity<> (checkDate, HttpStatus.OK);
    }
	
	
}
