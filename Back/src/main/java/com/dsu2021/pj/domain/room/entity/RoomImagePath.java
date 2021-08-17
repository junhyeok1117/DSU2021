package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoomImagePath {
	private Long room_index;
	private int image_number;
	private String image_path;
}
