package com.dsu2021.pj.domain.room.dto;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Alias("roomDTO")// RoomMapper.xml에서 쓰기 위한 별명 지정
@Setter
@Getter
public class RoomDTO {
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class RoomReq{
		private String location="";
		private String kind="";
		private String siDo="";
		private String siGunGu="";
		private Date checkInDate;
		private Date checkOutDate;
		private Integer maxPerson=0;
		
		public RoomReq(RoomDTO.RoomReq req, Date checkInDate, Date checkOutDate) {
			this.location = req.location;
			this.kind = req.kind;
			this.siDo = req.siDo;
			this.siGunGu = req.siGunGu;
			this.checkInDate = checkInDate;
			this.checkOutDate = checkOutDate;
			this.maxPerson = req.maxPerson;
		}
	}
	
	
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
