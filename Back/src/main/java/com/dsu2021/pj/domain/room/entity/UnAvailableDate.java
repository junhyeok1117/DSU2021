package com.dsu2021.pj.domain.room.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UnAvailableDate {
	private Long roomIndex;
	private Date date;
}
