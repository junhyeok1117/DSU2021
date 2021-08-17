package com.dsu2021.pj.domain.room.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoomAddress {
	private Long room_address_index;
	private String si_do;
	private String si_gun_gu;
	private String eup_myeon_dong;
	private String road_name;
	private String detail_address;
	private float latitude;
	private float longitude;
}
