package com.dsu2021.pj.domain.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsu2021.pj.domain.reservation.repository.ReservationMapper;

@Service
public class ReservationService {

	@Autowired
	private ReservationMapper reservationMapper;

	public void getReservationByIndex(Long index) {
		
	}

}
