package com.dsu2021.pj.domain.room.dto;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Alias("roomImagePathDTO")
@AllArgsConstructor
@Getter
public class RoomImagePathDTO {
	private Long roomIndex;
	private int imageNumber;
	private String imagePath;
}
