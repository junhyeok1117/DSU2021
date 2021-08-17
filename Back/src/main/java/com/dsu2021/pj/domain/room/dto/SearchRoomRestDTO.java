package com.dsu2021.pj.domain.room.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SearchRoomRestDTO {
	private String location;
	private String kind;
	private String si_do;
	private String si_gun_gu;
	private String check_in_date;
	private String check_out_date;
	private String adult;
	private String child;
}
