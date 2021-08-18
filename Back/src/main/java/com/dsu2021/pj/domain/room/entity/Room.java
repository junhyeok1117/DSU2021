package com.dsu2021.pj.domain.room.entity;

import org.apache.ibatis.type.Alias;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Alias("room")// RoomMapper.xml에서 쓰기 위한 별명 지정
@AllArgsConstructor
@Getter
public class Room {
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
