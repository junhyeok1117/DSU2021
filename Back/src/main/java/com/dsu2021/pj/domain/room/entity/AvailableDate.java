package com.dsu2021.pj.domain.room.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AvailableDate {
	private Long available_date_index;
	private Long room_index;
	private Date date;
}
