package com.dsu2021.pj.domain.room.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RoomRestDTO {
	private Long room_index;
	private Long user_index;
	private Long address_index;
	private Long category_index;
	private String name;
	private int price;
	private int clean_price;
	private int max_person;
	private String content;
}
