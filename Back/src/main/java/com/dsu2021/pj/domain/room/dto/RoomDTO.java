package com.dsu2021.pj.domain.room.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class RoomDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomReq{
		private Long roomIndex;
		private String location;
		private String kind;
		private String siDo;
		private String siGunGu;
		private Date checkInDate;
		private Date checkOutDate;
		private Integer maxPerson;
	}
	
	@Alias("room")// RoomMapper.xml에서 쓰기 위한 별명 지정
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomRes{
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

}
