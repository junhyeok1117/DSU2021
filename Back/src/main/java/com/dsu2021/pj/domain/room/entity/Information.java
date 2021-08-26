package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Information {
	private Long roomIndex;
	private String selfCheckIn;
	private String commonSolo;
}
