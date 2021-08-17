package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Reservation {
	private Long reservation_index;
	private Long user_index;
	private Long room_index;
	private String reservation_state;
	private int reservation_price;
	private Date check_in_date;
	private Date check_out_date;
	private Date reservation_date;
}
