package com.dsu2021.pj.domain.room.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Facility {
	private Long room_index;
	private Integer bed;
	private Integer bath;
	private String tv;
	private String hair_dryer;
	private String fire_extinguisher;
	private String refrigerator;
	private String microwave;
	private String cookware;
	private String park;
	private String aircon;
	private String kitchen;
	private String wifi;
	private String washing_machine;
}
