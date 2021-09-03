package com.dsu2021.pj.domain.reservation.controller;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dsu2021.pj.domain.reservation.service.ReservationService;
import com.dsu2021.pj.domain.user.dto.UserDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(origins="*")
@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService service;

    //예약조회
    @GetMapping ("/reservations/{index}")
    public ResponseEntity<UserDto.UserCheckEmail> getReservationByIndex(@PathVariable("index") Long index) {

    	service.getReservationByIndex(index);

        return new ResponseEntity<UserDto.UserCheckEmail>(HttpStatus.OK);

    }


    //예약요청
    @PostMapping("/reservations/{roomIndex}")
    public ResponseEntity<ReservationDto.CheckDate> reservation(HttpServletRequest request, @PathVariable("roomIndex") Long roomIndex, @RequestBody ReservationDto.InsertReq insertReq) {

//        1. 입력 값인 체크인, 체크아웃, 인원 수를 dto에 담기
//        2. 현재 선택한 숙소의 index, 기본가격, 청소비 가져오기
//        3. 현재 user session을 확인하여 userindex 가져오기
//        4. 예약 상태는 결제 대기 상태로 임시로 저장해두기

        HttpSession session = request.getSession();

        String currentSession = (String) session.getAttribute("email");

        ReservationDto.CheckDate checkDate = service.reservation(roomIndex,insertReq,currentSession);

        return new ResponseEntity<> (checkDate, HttpStatus.OK);
    }
	
	
}
