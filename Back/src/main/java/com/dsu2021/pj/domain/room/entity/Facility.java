package com.dsu2021.pj.domain.room.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Facility {
	private Long room_index;
	private String tv;
	private String hair_dryer;
	private String fire_extinguisher;
	private String refrigerator;
	private String microwave;
	private String cookware;
	private Integer park;
	private Integer aircon;
	private Integer kitchen;
	private Integer wifi;
	private Integer washing_machine;
}
