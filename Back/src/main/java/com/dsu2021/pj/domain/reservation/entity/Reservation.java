package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Reservation {
	private Long reservationindex;
	private Long userindex;
	private Long roomIndex;
	private String reservationState;
	private int reservationPrice;
	private Date checkinDate;
	private Date checkoutDate;
	private Date reservationDate;
}
