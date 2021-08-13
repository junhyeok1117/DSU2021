package com.dsu2021.pj.domain.reservation.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReservationCancel {
	private Long reservation_index;
	private Date date;
	private String reason;
}
