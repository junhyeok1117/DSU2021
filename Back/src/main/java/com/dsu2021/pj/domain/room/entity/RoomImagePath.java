package com.dsu2021.pj.domain.room.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoomImagePath {
	private Long roomIndex;
	private int imageNumber;
	private String imagePath;
}
