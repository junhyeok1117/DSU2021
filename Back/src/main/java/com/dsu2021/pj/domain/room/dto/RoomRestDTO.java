package com.dsu2021.pj.domain.room.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoomRestDTO {
	private Long roomIndex;
	private Long userIndex;
	private Long addressIndex;
	private Long categoryIndex;
	private String name;
	private int price;
	private int cleanPrice;
	private int maxPerson;
	private String content;
}
