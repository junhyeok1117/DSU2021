package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Facility {
	private Long roomIndex;
	private Integer bed;
	private Integer bath;
	private String tv;
	private String hairDryer;
	private String fireExtinguisher;
	private String refrigerator;
	private String microwave;
	private String cookware;
	private String park;
	private String aircon;
	private String kitchen;
	private String wifi;
	private String washingMachine;
}
