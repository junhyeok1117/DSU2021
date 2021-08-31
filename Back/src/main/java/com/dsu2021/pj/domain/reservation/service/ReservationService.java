package com.dsu2021.pj.domain.reservation.service;

import com.dsu2021.pj.domain.reservation.dto.ReservationDto;
import com.dsu2021.pj.domain.reservation.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.reservation.repository.ReservationMapper;

import java.util.List;

@Service
public class ReservationService {

	@Autowired
	private ReservationMapper reservationMapper;

	public void getReservationByIndex(Long index) {
		
	}

	public ReservationDto.RoomReq reservation(Long roomIndex, ReservationDto.InsertReq insertReq) {

//		reservationMapper.reservation(new ReservationDto.InsertReq(insertReq.getCheckinDate(), insertReq.getCheckoutDate(), insertReq.getAdult(), insertReq.getChild()));

		ReservationDto.RoomReq roomReqs = reservationMapper.selectRoom(roomIndex);



		return null;
	}


}
