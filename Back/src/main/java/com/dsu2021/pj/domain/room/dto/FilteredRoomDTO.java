package com.dsu2021.pj.domain.room.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Alias("filteredRoom")// RoomMapper.xml에서 쓰기 위한 별명 지정
@AllArgsConstructor
@Getter
public class FilteredRoomDTO {
	private Long roomIndex;
	private String name;
	private int maxPerson;
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
	private String location;
	private String kind;
}
