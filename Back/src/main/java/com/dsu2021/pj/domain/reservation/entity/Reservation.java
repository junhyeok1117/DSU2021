package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Reservation {
	private Long reservationIndex;
	private Long userIndex;
	private Long roomIndex;
	private String reservationState;
	private int reservationPrice;
	private Date checkinDate;
	private Date checkoutDate;
	private Date reservationDate;
	private int adult;
	private int child;
}