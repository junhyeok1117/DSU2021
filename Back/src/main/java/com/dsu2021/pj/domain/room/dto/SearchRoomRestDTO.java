package com.dsu2021.pj.domain.room.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SearchRoomRestDTO {
	private String location;
	private String kind;
	private String si_do;
	private String si_gun_gu;
	private String checkinDate;
	private String checkoutDate;
	private String adult;
	private String child;
}
